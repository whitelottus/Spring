/*
 * jabalation
 */

package com.ggwlot.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *esta uri será:
 * http://localhost:8084/introduccionSpring/servicio-cuenta/tipo/nomina
 * @author Whitelottus
 */

@Controller
@RequestMapping("/servicio-cuenta")
public class ControladorNominas {
    @RequestMapping(value="/tipo/{tipo}", method=RequestMethod.GET)
    public String obtenerNomina(@PathVariable String tipo, Model model){
        
        String mensaje="Tu estas interesado en un tipo de cuenta "+tipo;
        model.addAttribute("minomina", mensaje);
        
        return "servicioNomina";
    }
    
}
