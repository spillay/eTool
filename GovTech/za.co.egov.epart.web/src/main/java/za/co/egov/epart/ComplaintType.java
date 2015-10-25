package za.co.egov.epart;
// Generated 24 Oct 2015 12:03:20 PM by Hibernate Tools 3.2.2.GA


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
 * ComplaintType generated by hbm2java
 */
@Entity
@Table(name="complainttype"
    ,schema="public"
)
public class ComplaintType  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<Complaint> COMPLAINT_COMPLAINTTYPES = new HashSet<Complaint>(0);

    public ComplaintType() {
    }

    public ComplaintType(String name, Set<Complaint> COMPLAINT_COMPLAINTTYPES) {
       this.name = name;
       this.COMPLAINT_COMPLAINTTYPES = COMPLAINT_COMPLAINTTYPES;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="complainttype")
    public Set<Complaint> getCOMPLAINT_COMPLAINTTYPES() {
        return this.COMPLAINT_COMPLAINTTYPES;
    }
    
    public void setCOMPLAINT_COMPLAINTTYPES(Set<Complaint> COMPLAINT_COMPLAINTTYPES) {
        this.COMPLAINT_COMPLAINTTYPES = COMPLAINT_COMPLAINTTYPES;
    }




}


