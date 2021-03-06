package za.co.egov.cn;
// Generated 18 Nov 2015 12:33:12 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PermitHistory generated by hbm2java
 */
@Entity
@Table(name="permithistory"
    ,schema="public"
)
public class PermitHistory  implements java.io.Serializable {


     private Integer id;
     private Date dateChanged;
     private String referenceNo;
     private String permitDescription;
     private String notificationSend;
     private String reasonForChge;
     private PermitType permittype;
     private PermitStatus permitstatus;
     private Permit permit;

    public PermitHistory() {
    }

	
    public PermitHistory(PermitType permittype, PermitStatus permitstatus, Permit permit) {
        this.permittype = permittype;
        this.permitstatus = permitstatus;
        this.permit = permit;
    }
    public PermitHistory(Date dateChanged, String referenceNo, String permitDescription, String notificationSend, String reasonForChge, PermitType permittype, PermitStatus permitstatus, Permit permit) {
       this.dateChanged = dateChanged;
       this.referenceNo = referenceNo;
       this.permitDescription = permitDescription;
       this.notificationSend = notificationSend;
       this.reasonForChge = reasonForChge;
       this.permittype = permittype;
       this.permitstatus = permitstatus;
       this.permit = permit;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="datechanged", length=30)
    public Date getDateChanged() {
        return this.dateChanged;
    }
    
    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }
    
    @Column(name="referenceno", length=100)
    public String getReferenceNo() {
        return this.referenceNo;
    }
    
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
    
    @Column(name="permitdescription", length=100)
    public String getPermitDescription() {
        return this.permitDescription;
    }
    
    public void setPermitDescription(String permitDescription) {
        this.permitDescription = permitDescription;
    }
    
    @Column(name="notificationsend", length=100)
    public String getNotificationSend() {
        return this.notificationSend;
    }
    
    public void setNotificationSend(String notificationSend) {
        this.notificationSend = notificationSend;
    }
    
    @Column(name="reasonforchge", length=100)
    public String getReasonForChge() {
        return this.reasonForChge;
    }
    
    public void setReasonForChge(String reasonForChge) {
        this.reasonForChge = reasonForChge;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMITHISTORY_PERMITTYPE_ID", nullable=false)
    public PermitType getPermittype() {
        return this.permittype;
    }
    
    public void setPermittype(PermitType permittype) {
        this.permittype = permittype;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMITHISTORY_PERMITSTATUS_ID", nullable=false)
    public PermitStatus getPermitstatus() {
        return this.permitstatus;
    }
    
    public void setPermitstatus(PermitStatus permitstatus) {
        this.permitstatus = permitstatus;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMITHISTORY_PERMIT_ID", nullable=false)
    public Permit getPermit() {
        return this.permit;
    }
    
    public void setPermit(Permit permit) {
        this.permit = permit;
    }




}


