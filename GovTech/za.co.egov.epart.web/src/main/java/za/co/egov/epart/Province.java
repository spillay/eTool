package za.co.egov.epart;
// Generated 24 Oct 2015 4:19:38 AM by Hibernate Tools 3.2.2.GA


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
 * Province generated by hbm2java
 */
@Entity
@Table(name="province"
    ,schema="public"
)
public class Province  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<Department> DEPARTMENT_PROVINCES = new HashSet<Department>(0);

    public Province() {
    }

    public Province(String name, Set<Department> DEPARTMENT_PROVINCES) {
       this.name = name;
       this.DEPARTMENT_PROVINCES = DEPARTMENT_PROVINCES;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="province")
    public Set<Department> getDEPARTMENT_PROVINCES() {
        return this.DEPARTMENT_PROVINCES;
    }
    
    public void setDEPARTMENT_PROVINCES(Set<Department> DEPARTMENT_PROVINCES) {
        this.DEPARTMENT_PROVINCES = DEPARTMENT_PROVINCES;
    }




}


