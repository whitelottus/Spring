/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.first;

/**
 *
 * @author T107
 */
public class Opcion {
    private String titulo;
    private boolean valor;
       
    public Opcion(String titulo, boolean valor) {
            this.titulo = titulo;
            this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

   
    
}
    
    

