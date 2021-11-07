
package proyecto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class ControladorInicio {

    
    
    
    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    
    
    
    @GetMapping("/usuario")
    public String usuario() {
        return "usuario";
    }

    
    
    @GetMapping("/profesion")
    public String profesion() {
        return "profesion";
    }

}
