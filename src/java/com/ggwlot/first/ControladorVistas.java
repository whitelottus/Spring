/*
 * @author Whitelottus
 */

package com.ggwlot.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/empresas")
public class ControladorVistas {
    
    @Autowired ServicioCuenta cuenta;
    
    @RequestMapping(value="/nominas.php")
    public String accesoAnominas(Model model){
        model.addAttribute("gatonejo", cuenta.crearCuenta());
        return "algodon";
}
    
        @RequestMapping(value="/administracion.php")
    public String accesoAdmin(){

        return "nuevapag";
}
    
}
