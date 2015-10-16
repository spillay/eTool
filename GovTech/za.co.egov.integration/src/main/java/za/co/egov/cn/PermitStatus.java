package za.co.egov.cn;
// Generated 15 Oct 2015 7:30:30 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PermitStatus generated by hbm2java
 */
@Entity
@Table(name="permitstatus"
    ,schema="public"
)
public class PermitStatus  implements java.io.Serializable {


     private Integer id;
     private String Status;

    public PermitStatus() {
    }

    public PermitStatus(String Status) {
       this.Status = Status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="status", length=20)
    public String getStatus() {
        return this.Status;
    }
    
    public void setStatus(String Status) {
        this.Status = Status;
    }




}


