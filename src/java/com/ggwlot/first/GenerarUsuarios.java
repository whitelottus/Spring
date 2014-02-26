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
public class GenerarUsuarios {
    
    public static ArrayList<Usuario> obtenerUsuarios(){
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        Usuario u1=new Usuario("Algo lol","15 54 255",30000);
        Usuario u2=new Usuario("roflcopter lmao","45 99 28",51254);
        Usuario u3=new Usuario("lulz rofl","50 12 350",12563);
        Usuario u4=new Usuario("James Rofle","88 22 64",12563);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        
        return usuarios;

    }
    
}
