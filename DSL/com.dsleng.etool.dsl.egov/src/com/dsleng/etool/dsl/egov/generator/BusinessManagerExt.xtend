package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.bobjs.BusinessObject
import java.beans.Introspector
import com.dsleng.etool.models.bobjs.Attribute
import com.dsleng.etool.models.egov.BOMapper
import com.dsleng.etool.models.bobjs.Operation
import com.dsleng.etool.dsl.egov.Lg
import com.dsleng.etool.models.bobjs.OrgUnit
import com.dsleng.etool.models.bobjs.References

class BusinessManagerExt {
	// Hibernate Info
	def static getColumnName(Attribute e){
		return e.name.toLowerCase
	}
	def static getTBString(Attribute e)'''
<property name="«e.name»" type="string">
     <column name="«e.columnName»" length="20" not-null="false" />
</property>
	'''
	def static getTBDate(Attribute e)'''
<property name="«e.name»" type="date">
     <column name="«e.columnName»" length="13" not-null="false" />
</property>
	'''
def static getTBInteger(Attribute e)'''
<property name="«e.name»" type="int">
     <column name="«e.columnName»"  not-null="false" />
</property>
	'''
def static getTBBoolean(Attribute e)'''
<property name="«e.name»" type="boolean">
     <column name="«e.columnName»"  not-null="false" />
</property>
	'''
def static getTBDouble(Attribute e)'''
<property name="«e.name»" type="double">
     <column name="«e.columnName»"  not-null="false" />
</property>
	'''
	
	def static getTableInfo(Attribute e){
		switch e.type {
			case STRING:
				return e.getTBString()
			case DATE:
				return e.getTBDate()
			case INTEGER:
				return e.getTBInteger()
			case BOOLEAN:
				return e.getTBBoolean()
			case DOUBLE:
				return e.getTBDouble()
			default: {
			}
  			
  		}
	}
	def static getjointID(References r){
		var nme = (r.eContainer as BusinessObject).tableName + "_" + r.businessobject.tableName + "_ID"
		return nme.toUpperCase
	}
	def static getSetsName(References r){
		var nme = (r.eContainer as BusinessObject).tableName + "_" + r.businessobject.tableName + "S"
		return nme.toUpperCase
	}
	def static getManyToOne(References e)'''
<many-to-one name="«e.businessobject.tableName»" class="«e.businessobject.FQN»"
            column="«e.getjointID»" not-null="true"/>
'''
	def static getRevManyToOne(References e)'''
<set name="«e.setsName»" inverse="true" cascade="all">
            <key column="«e.getjointID»" not-null="true" />
            <one-to-many class="«(e.eContainer as BusinessObject).FQN»"/>
        </set>
'''




	def static getTableReference(References e){
		switch e.multiplicity {
			case MANY_TOONE:
				return e.manyToOne
			case ONE_TOMANY:
				return e.revManyToOne
			default: {}
		}
	}
	def static getRevTableReference(References e){
		switch e.multiplicity {
			case MANY_TOONE:
				return e.revManyToOne
			case ONE_TOMANY:
				return e.manyToOne
			default: {}
		}
	}
	// End Hibernate Info
	def static cleanUp(BusinessObject e){
		// Remove any operations from the Model
		e.operations.clear
		// Remove any attributes for DataManagemnt
		var it = e.attributes.iterator
		while(it.hasNext){
			val o = it.next
			if (o.dataManagement) {
				it.remove()
			}
		}
	}
	def static getFQN(BusinessObject e){
		return (e.eContainer as OrgUnit).package + "." + e.name
	}
	def static getTableName(BusinessObject e){
		return  e.name.toLowerCase
	}
	def static getUsingBeanName(BusinessObject e){
		return Introspector.decapitalize(e.name) + "Bean"
	}
	def static getDeclBeanName(BusinessObject e){
		return e.name + "Bean"
	}
	def static Prepare(BusinessObject e){
		return e
	}
	def static getUsingName(Attribute e){
		return "#{" + (e.eContainer as BusinessObject).usingBeanName + "." + Introspector.decapitalize(e.name) + "}"
	}
	def static getUsingNameFor(Attribute e,String name){
		return "#{" + (e.eContainer as BusinessObject).usingBeanName + "." + Introspector.decapitalize(name) + "}"
	}
	def static viewCheck(Attribute e){
		return e.dataManagement
	}
	def static getOps(BusinessObject e){
		var syntax = ""
		for(op: e.operations){
			syntax += op.opSyntax + "\n"
		}
		return syntax
	}
	def static getOpSyntax(Operation op){
		var syntax = ""
		for(a: op.annotations){
			syntax += "@" + a.name + "\n"
		}
		syntax +='''
public void «op.name»('''
		
		for(p: op.opparameters){
			syntax +='''
«p.type» «p.name»; 
'''
		}
		syntax +=''')
{
'''
		syntax += op.syntax
		syntax +='''
}
'''
	}
}