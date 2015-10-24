package za.co.egov.cn;
// Generated 24 Oct 2015 10:02:20 AM by Hibernate Tools 3.2.2.GA


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
 * Client generated by hbm2java
 */
@Entity
@Table(name="client"
    ,schema="public"
)
public class Client  implements java.io.Serializable {


     private Integer id;
     private String idno;
     private String cardno;
     private String cardpin;
     private String firstname1;
     private String firstname2;
     private String firstname3;
     private String surname;
     private String telphoneno;
     private String cellno;
     private String email;
     private String prefContact;
     private Set<Permit> PERMIT_CLIENTS = new HashSet<Permit>(0);

    public Client() {
    }

    public Client(String idno, String cardno, String cardpin, String firstname1, String firstname2, String firstname3, String surname, String telphoneno, String cellno, String email, String prefContact, Set<Permit> PERMIT_CLIENTS) {
       this.idno = idno;
       this.cardno = cardno;
       this.cardpin = cardpin;
       this.firstname1 = firstname1;
       this.firstname2 = firstname2;
       this.firstname3 = firstname3;
       this.surname = surname;
       this.telphoneno = telphoneno;
       this.cellno = cellno;
       this.email = email;
       this.prefContact = prefContact;
       this.PERMIT_CLIENTS = PERMIT_CLIENTS;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="idno", length=100)
    public String getIdno() {
        return this.idno;
    }
    
    public void setIdno(String idno) {
        this.idno = idno;
    }
    
    @Column(name="cardno", length=100)
    public String getCardno() {
        return this.cardno;
    }
    
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
    
    @Column(name="cardpin", length=100)
    public String getCardpin() {
        return this.cardpin;
    }
    
    public void setCardpin(String cardpin) {
        this.cardpin = cardpin;
    }
    
    @Column(name="firstname1", length=100)
    public String getFirstname1() {
        return this.firstname1;
    }
    
    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }
    
    @Column(name="firstname2", length=100)
    public String getFirstname2() {
        return this.firstname2;
    }
    
    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }
    
    @Column(name="firstname3", length=100)
    public String getFirstname3() {
        return this.firstname3;
    }
    
    public void setFirstname3(String firstname3) {
        this.firstname3 = firstname3;
    }
    
    @Column(name="surname", length=100)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    @Column(name="telphoneno", length=100)
    public String getTelphoneno() {
        return this.telphoneno;
    }
    
    public void setTelphoneno(String telphoneno) {
        this.telphoneno = telphoneno;
    }
    
    @Column(name="cellno", length=100)
    public String getCellno() {
        return this.cellno;
    }
    
    public void setCellno(String cellno) {
        this.cellno = cellno;
    }
    
    @Column(name="email", length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="prefcontact", length=100)
    public String getPrefContact() {
        return this.prefContact;
    }
    
    public void setPrefContact(String prefContact) {
        this.prefContact = prefContact;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="client")
    public Set<Permit> getPERMIT_CLIENTS() {
        return this.PERMIT_CLIENTS;
    }
    
    public void setPERMIT_CLIENTS(Set<Permit> PERMIT_CLIENTS) {
        this.PERMIT_CLIENTS = PERMIT_CLIENTS;
    }




}


