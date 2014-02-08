

package com.ggwlot.first;

/**
 * @author Whitelottus
 * Regla #1:
 * Si hay una operacion transversal (que sea el mismo tipo de operacion)
 * pero que la lógica varíe entre implementación
 * PROGRAMAR A INTERFACES.
 * Regla #2:
 * Si existen atributos compartidos entre implementación
 * de característica similar scarlas de la clase y usar Herencia.
 * 
 */
public class Cuenta {
    private String nombre;
    private int numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
