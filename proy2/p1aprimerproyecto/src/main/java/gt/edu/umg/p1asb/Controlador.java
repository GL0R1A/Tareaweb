/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1asb;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author STEFANNIE FLANDEZ
 */
@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    public String inicio (Model model){
        log.info("Entrando al controlador inicio de MVC");
        var msg ="Un gusto saludarlo esta es la tabla de Comisiones";
        var person = new person();
        person.setNombre("Patricia");
        person.setApellido("Marroquin");
        person.setEner("58");
        person.setFebrer("66");
        person.setMarz("27");
        
        var Persona3 = new person();
        Persona3.setNombre("Kevin");
        Persona3.setApellido("Mendez");
        Persona3.setEner("789");
        Persona3.setFebrer("254");
        Persona3.setMarz("789");
        
        var Personas = Arrays.asList(person,Persona3);
        
        model.addAttribute("msg", msg);
        model.addAttribute("Personas", Personas);
        
        return "index";
        
    }
    
    
}
