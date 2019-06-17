/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.controlador.ControladorEscribirLeer;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Domenica Cañizares
 */
public class ManejoArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Palabras de los archivos");
        //String resul ="";
        
        ControladorEscribirLeer control = new ControladorEscribirLeer();
        String ruta = "C:\\Users\\Domenica Cañizares\\Desktop\\netbeans\\ManejoArchivosDeTexto\\src\\ec\\edu\\ups\\archivos";
        
        File archivo = new File(ruta);
        File[] archivo2 = archivo.listFiles();
        for (File archivos : archivo2) {
            
            if (!archivos.getName().equals("ConteoPalabras.txt")) {
                
                control.bolsaPalabras(ruta + "\\" + archivos.getName());
                
                //resul = control.leerOracion();
                
            }
        }
        
        control.escribir();
        
    }
    
}
