/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author whitelottus
 */
@Configuration
public class Apconfig {
    
    @Bean
    ServicioCuenta crearCuentaDeBanco(){
        
        return new  CuentaNominaImpl();
    }
}
