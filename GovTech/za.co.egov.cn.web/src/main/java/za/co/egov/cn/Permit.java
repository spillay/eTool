package za.co.egov.cn;
// Generated 18 Oct 2015 4:49:29 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Permit generated by hbm2java
 */
@Entity
@Table(name="permit"
    ,schema="public"
)
public class Permit  implements java.io.Serializable {


     private Integer id;
     private String permitNo;
     private String referenceNo;
     private String permitStatus;
     private Date dateIssued;
     private Date dteValidFrom;
     private Date dteValidTo;
     private double amountPaid;
     private PermitType permittype;
     private PermitStatus permitstatus;
     private Client client;
     private Set<PermitHistory> PERMITHISTORY_PERMITS = new HashSet<PermitHistory>(0);

    public Permit() {
    }

	
    public Permit(PermitType permittype, PermitStatus permitstatus, Client client) {
        this.permittype = permittype;
        this.permitstatus = permitstatus;
        this.client = client;
    }
    public Permit(String permitNo, String referenceNo, String permitStatus, Date dateIssued, Date dteValidFrom, Date dteValidTo, double amountPaid, PermitType permittype, PermitStatus permitstatus, Client client, Set<PermitHistory> PERMITHISTORY_PERMITS) {
       this.permitNo = permitNo;
       this.referenceNo = referenceNo;
       this.permitStatus = permitStatus;
       this.dateIssued = dateIssued;
       this.dteValidFrom = dteValidFrom;
       this.dteValidTo = dteValidTo;
       this.amountPaid = amountPaid;
       this.permittype = permittype;
       this.permitstatus = permitstatus;
       this.client = client;
       this.PERMITHISTORY_PERMITS = PERMITHISTORY_PERMITS;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="permitno", length=100)
    public String getPermitNo() {
        return this.permitNo;
    }
    
    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }
    
    @Column(name="referenceno", length=100)
    public String getReferenceNo() {
        return this.referenceNo;
    }
    
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
    
    @Column(name="permitstatus", length=100)
    public String getPermitStatus() {
        return this.permitStatus;
    }
    
    public void setPermitStatus(String permitStatus) {
        this.permitStatus = permitStatus;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dateissued", length=30)
    public Date getDateIssued() {
        return this.dateIssued;
    }
    
    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dtevalidfrom", length=30)
    public Date getDteValidFrom() {
        return this.dteValidFrom;
    }
    
    public void setDteValidFrom(Date dteValidFrom) {
        this.dteValidFrom = dteValidFrom;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dtevalidto", length=30)
    public Date getDteValidTo() {
        return this.dteValidTo;
    }
    
    public void setDteValidTo(Date dteValidTo) {
        this.dteValidTo = dteValidTo;
    }
    
    @Column(name="amountpaid")
    public double getAmountPaid() {
        return this.amountPaid;
    }
    
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMIT_PERMITTYPE_ID", nullable=false)
    public PermitType getPermittype() {
        return this.permittype;
    }
    
    public void setPermittype(PermitType permittype) {
        this.permittype = permittype;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMIT_PERMITSTATUS_ID", nullable=false)
    public PermitStatus getPermitstatus() {
        return this.permitstatus;
    }
    
    public void setPermitstatus(PermitStatus permitstatus) {
        this.permitstatus = permitstatus;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERMIT_CLIENT_ID", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="permit")
    public Set<PermitHistory> getPERMITHISTORY_PERMITS() {
        return this.PERMITHISTORY_PERMITS;
    }
    
    public void setPERMITHISTORY_PERMITS(Set<PermitHistory> PERMITHISTORY_PERMITS) {
        this.PERMITHISTORY_PERMITS = PERMITHISTORY_PERMITS;
    }




}


