package za.co.egov.cn;
// Generated 20 Oct 2015 1:43:19 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CapeNature generated by hbm2java
 */
@Entity
@Table(name="capenature"
    ,schema="public"
)
public class CapeNature  implements java.io.Serializable {


     private Integer id;

    public CapeNature() {
    }

   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }




}


