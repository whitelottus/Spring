/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.first;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarPreguntas {
    
    public ArrayList<Pregunta> obtenerPregunta(){
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
        
        Opcion opcion11= new Opcion("Tokio",true);
        Opcion opcion21= new Opcion("Moscu",false);
        Opcion opcion31= new Opcion("Mixcalco", false);
        Opcion opcion41= new Opcion("Ecatepunk", false);
        opciones1.add(opcion11);
        opciones1.add(opcion21);
        opciones1.add(opcion31);
        opciones1.add(opcion41);
        
        Pregunta p1=new Pregunta(opciones1,"Cual es la capital de Japon?");
        preguntas.add(p1);
        
        return preguntas;
    }
    
}
