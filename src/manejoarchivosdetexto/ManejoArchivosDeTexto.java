/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivosdetexto;

import ec.edu.ups.controlador.ControladorConteoPalabras;

/**
 *
 * @author Domenica Cañizares
 */
public class ManejoArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorConteoPalabras control = new ControladorConteoPalabras();
        
        control.escribir();
        //control.leer();
    }
    
}
