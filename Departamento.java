
package proyecto.dto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "TB_DEPARTAMENTO")
public class Departamento implements Serializable {
   
    
    private static final long serialVersionUI = 1L;

    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int ID_DEPTO;
    private String DESCRIPCION_DEPTO;

    
    
    
}
