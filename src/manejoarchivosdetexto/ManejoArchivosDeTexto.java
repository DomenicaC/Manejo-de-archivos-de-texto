/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivosdetexto;

/**
 *
 * @author Domenica Cañizares
 */
public class ManejoArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador control = new Controlador();
        
        control.escribir();
        control.leer();
    }
    
}
