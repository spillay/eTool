package za.co.egov.cn;
// Generated 15 Oct 2015 7:30:30 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PermitType generated by hbm2java
 */
@Entity
@Table(name="permittype"
    ,schema="public"
)
public class PermitType  implements java.io.Serializable {


     private Integer id;
     private String name;

    public PermitType() {
    }

    public PermitType(String name) {
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


