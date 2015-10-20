package za.co.egov.epart;
// Generated 20 Oct 2015 1:33:32 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Complaint generated by hbm2java
 */
@Entity
@Table(name="complaint"
    ,schema="public"
)
public class Complaint  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Citizen citizen;
     private ComplaintType complainttype;
     private Department department;
     private Province province;

    public Complaint() {
    }

	
    public Complaint(Citizen citizen, ComplaintType complainttype, Department department, Province province) {
        this.citizen = citizen;
        this.complainttype = complainttype;
        this.department = department;
        this.province = province;
    }
    public Complaint(String name, String description, Citizen citizen, ComplaintType complainttype, Department department, Province province) {
       this.name = name;
       this.description = description;
       this.citizen = citizen;
       this.complainttype = complainttype;
       this.department = department;
       this.province = province;
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
    
    @Column(name="description", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPLAINT_CITIZEN_ID", nullable=false)
    public Citizen getCitizen() {
        return this.citizen;
    }
    
    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPLAINT_COMPLAINTTYPE_ID", nullable=false)
    public ComplaintType getComplainttype() {
        return this.complainttype;
    }
    
    public void setComplainttype(ComplaintType complainttype) {
        this.complainttype = complainttype;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPLAINT_DEPARTMENT_ID", nullable=false)
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPLAINT_PROVINCE_ID", nullable=false)
    public Province getProvince() {
        return this.province;
    }
    
    public void setProvince(Province province) {
        this.province = province;
    }




}

