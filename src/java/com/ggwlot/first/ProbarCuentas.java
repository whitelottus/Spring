
package com.ggwlot.first;

/**
 *
 * @author Whitelottus
 */
public class ProbarCuentas {
    
    public static void main(String args[]){
        
       System.out.println("Bienvenido a la creación de cuentas");
       ServicioCuenta c=new CuentaAhorroImpl();
       ServicioCuenta n=new CuentaNominaImpl();
       ServicioCuenta d=new CuentaDebitoImpl();
       
       System.out.println(c.crearCuenta());
       System.out.println(n.crearCuenta());
       System.out.println(d.crearCuenta());
       
    }
    
}
