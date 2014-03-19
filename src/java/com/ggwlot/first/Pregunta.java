

package com.ggwlot.first;

import java.util.ArrayList;

/**
 *
 * @author Whitelottus
 */
public class Pregunta {
    
    private ArrayList<Opcion> opciones;
    private String titulos;

    public Pregunta(ArrayList<Opcion> opciones, String titulos) {
        this.opciones = opciones;
        this.titulos = titulos;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }
    
}
