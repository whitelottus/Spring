/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.first;

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
    
    @RequestMapping(value="/hola",RequestMethod.GET,
            headers={"Accept=text/html"})
    public @ResponseBody
            
}
