package za.co.egov.epart;
// Generated 22 Oct 2015 10:48:00 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Agency generated by hbm2java
 */
@Entity
@Table(name="agency"
    ,schema="public"
)
public class Agency  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Department department;
     private Set<Complaint> COMPLAINT_AGENCYS = new HashSet<Complaint>(0);
     private Set<ComplaintHelp> COMPLAINTHELP_AGENCYS = new HashSet<ComplaintHelp>(0);

    public Agency() {
    }

	
    public Agency(Department department) {
        this.department = department;
    }
    public Agency(String name, Department department, Set<Complaint> COMPLAINT_AGENCYS, Set<ComplaintHelp> COMPLAINTHELP_AGENCYS) {
       this.name = name;
       this.department = department;
       this.COMPLAINT_AGENCYS = COMPLAINT_AGENCYS;
       this.COMPLAINTHELP_AGENCYS = COMPLAINTHELP_AGENCYS;
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
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AGENCY_DEPARTMENT_ID", nullable=false)
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="agency")
    public Set<Complaint> getCOMPLAINT_AGENCYS() {
        return this.COMPLAINT_AGENCYS;
    }
    
    public void setCOMPLAINT_AGENCYS(Set<Complaint> COMPLAINT_AGENCYS) {
        this.COMPLAINT_AGENCYS = COMPLAINT_AGENCYS;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="agency")
    public Set<ComplaintHelp> getCOMPLAINTHELP_AGENCYS() {
        return this.COMPLAINTHELP_AGENCYS;
    }
    
    public void setCOMPLAINTHELP_AGENCYS(Set<ComplaintHelp> COMPLAINTHELP_AGENCYS) {
        this.COMPLAINTHELP_AGENCYS = COMPLAINTHELP_AGENCYS;
    }




}


