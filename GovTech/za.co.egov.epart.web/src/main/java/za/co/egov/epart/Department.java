package za.co.egov.epart;
// Generated 19 Oct 2015 9:46:06 PM by Hibernate Tools 3.2.2.GA


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
 * Department generated by hbm2java
 */
@Entity
@Table(name="department"
    ,schema="public"
)
public class Department  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<Complaint> COMPLAINT_DEPARTMENTS = new HashSet<Complaint>(0);

    public Department() {
    }

    public Department(String name, Set<Complaint> COMPLAINT_DEPARTMENTS) {
       this.name = name;
       this.COMPLAINT_DEPARTMENTS = COMPLAINT_DEPARTMENTS;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="department")
    public Set<Complaint> getCOMPLAINT_DEPARTMENTS() {
        return this.COMPLAINT_DEPARTMENTS;
    }
    
    public void setCOMPLAINT_DEPARTMENTS(Set<Complaint> COMPLAINT_DEPARTMENTS) {
        this.COMPLAINT_DEPARTMENTS = COMPLAINT_DEPARTMENTS;
    }




}


