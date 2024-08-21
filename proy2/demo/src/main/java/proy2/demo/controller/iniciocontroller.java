package proy2.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class iniciocontroller {

    @RequestMapping("/")
    public String inicio(){
        return "index";
    } 
    
    @RequestMapping("/cursos")
    public String cursos(){
        return "pagina";

    }

    @RequestMapping("/mascotas")
    public String mascotas(){
        return "mascotas";

    }
}
