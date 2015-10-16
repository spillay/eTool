package za.co.egov.cn;
// Generated 16 Oct 2015 12:19:42 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WildAnimals generated by hbm2java
 */
@Entity
@Table(name="wildanimals"
    ,schema="public"
)
public class WildAnimals  implements java.io.Serializable {


     private Integer id;
     private String CommonName;

    public WildAnimals() {
    }

    public WildAnimals(String CommonName) {
       this.CommonName = CommonName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="commonname", length=20)
    public String getCommonName() {
        return this.CommonName;
    }
    
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }




}


