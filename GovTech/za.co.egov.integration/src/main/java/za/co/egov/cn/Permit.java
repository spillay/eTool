package za.co.egov.cn;
// Generated 15 Oct 2015 7:30:30 PM by Hibernate Tools 3.2.2.GA


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
     private String PermitNo;
     private String ReferenceNo;
     private Date DateIssued;
     private Date DteValidFrom;
     private Date DteValidTo;
     private double AmountPaid;
     private PermitType permittype;
     private PermitStatus permitstatus;
     private Client client;
     private Set<PermitHistory> PERMIT_PERMITHISTORYS = new HashSet<PermitHistory>(0);

    public Permit() {
    }

	
    public Permit(PermitType permittype, PermitStatus permitstatus, Client client) {
        this.permittype = permittype;
        this.permitstatus = permitstatus;
        this.client = client;
    }
    public Permit(String PermitNo, String ReferenceNo, Date DateIssued, Date DteValidFrom, Date DteValidTo, double AmountPaid, PermitType permittype, PermitStatus permitstatus, Client client, Set<PermitHistory> PERMIT_PERMITHISTORYS) {
       this.PermitNo = PermitNo;
       this.ReferenceNo = ReferenceNo;
       this.DateIssued = DateIssued;
       this.DteValidFrom = DteValidFrom;
       this.DteValidTo = DteValidTo;
       this.AmountPaid = AmountPaid;
       this.permittype = permittype;
       this.permitstatus = permitstatus;
       this.client = client;
       this.PERMIT_PERMITHISTORYS = PERMIT_PERMITHISTORYS;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="permitno", length=20)
    public String getPermitNo() {
        return this.PermitNo;
    }
    
    public void setPermitNo(String PermitNo) {
        this.PermitNo = PermitNo;
    }
    
    @Column(name="referenceno", length=20)
    public String getReferenceNo() {
        return this.ReferenceNo;
    }
    
    public void setReferenceNo(String ReferenceNo) {
        this.ReferenceNo = ReferenceNo;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dateissued", length=13)
    public Date getDateIssued() {
        return this.DateIssued;
    }
    
    public void setDateIssued(Date DateIssued) {
        this.DateIssued = DateIssued;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dtevalidfrom", length=13)
    public Date getDteValidFrom() {
        return this.DteValidFrom;
    }
    
    public void setDteValidFrom(Date DteValidFrom) {
        this.DteValidFrom = DteValidFrom;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dtevalidto", length=13)
    public Date getDteValidTo() {
        return this.DteValidTo;
    }
    
    public void setDteValidTo(Date DteValidTo) {
        this.DteValidTo = DteValidTo;
    }
    
    @Column(name="amountpaid")
    public double getAmountPaid() {
        return this.AmountPaid;
    }
    
    public void setAmountPaid(double AmountPaid) {
        this.AmountPaid = AmountPaid;
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
    @JoinColumn(name="CLIENT_PERMIT_ID", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="PERMIT_PERMITHISTORY_ID", updatable=false)
    public Set<PermitHistory> getPERMIT_PERMITHISTORYS() {
        return this.PERMIT_PERMITHISTORYS;
    }
    
    public void setPERMIT_PERMITHISTORYS(Set<PermitHistory> PERMIT_PERMITHISTORYS) {
        this.PERMIT_PERMITHISTORYS = PERMIT_PERMITHISTORYS;
    }




}


