

package com.ggwlot.first;

/**
 *
 * @author Whitelottus
 */
    
    public class CuentaAhorroImpl extends Cuenta implements ServicioCuenta{
    
  @Override
    public String crearCuenta (){
        
        return "Se ha creado con exito una cuenta de Ahorro";
    }     
}
