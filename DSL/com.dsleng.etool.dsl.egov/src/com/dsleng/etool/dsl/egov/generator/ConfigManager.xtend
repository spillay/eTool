package com.dsleng.etool.dsl.egov.generator

import java.util.ArrayList
import org.eclipse.xtext.generator.IFileSystemAccess

class Config {
	private String fileName
	private String content
	new(String fileName,String content){
		this.fileName = fileName
		this.content = content	
	}
	def getFileName(){ return fileName; }
	def getContent(){ return content }
	
	def update(String data,String rep){
		content = content.replace(rep,data)
	}
}


class ConfigManager {
	var baseProjectDir = ""
	new(String baseProjectDir){
		this.baseProjectDir = baseProjectDir
	}
	def processHibernateXML(IFileSystemAccess fsa,String beanInput,String annotatedClasses){
		var hb = new Config(getHibernateXMLFile(),hibernateXML.toString)
		hb.update(beanInput,"##BEANINPU##")
		hb.update(annotatedClasses,"##ANNCLASS##")
		fsa.generateFile(hb.fileName,hb.content)
		var hbTest = new Config(getTestHibernateXMLFile(),hb.content)
		fsa.generateFile(hbTest.fileName,hbTest.content)
	}
	public def getHibernateXMLFile(){
		return resourcesConfig + "config/hibernate.xml"
	}
	
	public def getResourcesConfig() {
		return baseProjectDir + "/src/main/resources/"
	}
	public def getTestHibernateXMLFile(){
		return testResourcesConfig + "config/hibernate.xml"
	}
	public def getTestResourcesConfig() {
		return baseProjectDir + "/src/test/resources/"
	}
	def getHibernateXML()'''
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
	<!-- Hibernate session factory -->
	<bean id="sessionFactory"
		class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
		<property name="dataSource">
			<ref bean="dataSource" />
		</property>
		<property name="annotatedClasses">
			<list>
				##ANNCLASS##
			</list>
		</property>
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</prop>
				<prop key="hibernate.show_sql">true</prop>
			</props>
		</property>
	</bean>

	<bean id="txManager"
		class="org.springframework.orm.hibernate4.HibernateTransactionManager">
		<property name="sessionFactory" ref="sessionFactory" />
	</bean>

	<bean id="persistenceExceptionTranslationPostProcessor"
		class="org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor" />

	##BEANINPU##
</beans>    
'''
}