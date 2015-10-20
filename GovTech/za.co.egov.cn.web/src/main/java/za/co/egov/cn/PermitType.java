package za.co.egov.cn;
// Generated 20 Oct 2015 2:37:27 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PermitType generated by hbm2java
 */
@Entity
@Table(name="permittype"
    ,schema="public"
)
public class PermitType  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<Permit> PERMIT_PERMITTYPES = new HashSet<Permit>(0);
     private Set<PermitHistory> PERMITHISTORY_PERMITTYPES = new HashSet<PermitHistory>(0);

    public PermitType() {
    }

    public PermitType(String name, Set<Permit> PERMIT_PERMITTYPES, Set<PermitHistory> PERMITHISTORY_PERMITTYPES) {
       this.name = name;
       this.PERMIT_PERMITTYPES = PERMIT_PERMITTYPES;
       this.PERMITHISTORY_PERMITTYPES = PERMITHISTORY_PERMITTYPES;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="permittype")
    public Set<Permit> getPERMIT_PERMITTYPES() {
        return this.PERMIT_PERMITTYPES;
    }
    
    public void setPERMIT_PERMITTYPES(Set<Permit> PERMIT_PERMITTYPES) {
        this.PERMIT_PERMITTYPES = PERMIT_PERMITTYPES;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="permittype")
    public Set<PermitHistory> getPERMITHISTORY_PERMITTYPES() {
        return this.PERMITHISTORY_PERMITTYPES;
    }
    
    public void setPERMITHISTORY_PERMITTYPES(Set<PermitHistory> PERMITHISTORY_PERMITTYPES) {
        this.PERMITHISTORY_PERMITTYPES = PERMITHISTORY_PERMITTYPES;
    }




}


