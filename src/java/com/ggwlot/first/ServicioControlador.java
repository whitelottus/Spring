/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Whitelottus
 */

@Controller
@RequestMapping("/servicios-rest")
public class ServicioControlador {
    
    @RequestMapping(value="/hola",method=RequestMethod.GET,
            headers={"Accept=text/html"})
    public @ResponseBody String enviarMensaje(){
        String mensajito="Hola mundo desde REST";
        return mensajito;
    }
    @RequestMapping(value="/json", method=RequestMethod.GET,headers={"Accept=application/jason"})
    public @ResponseBody String buscarUsuarios()throws Exception{
        Map<String, ArrayList<Usuario>> singletonMap=Collections.singletonMap("usuarios", GenerarUsuarios.obtenerUsuarios());
    ObjectMapper mapper=new ObjectMapper();
    return mapper.writeValueAsString(singletonMap);
    }
            
}
