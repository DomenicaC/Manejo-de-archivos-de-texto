/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorEscribir {

    private String ruta;
    private FileWriter escribirArc;
    private BufferedWriter escribir;

    public ControladorEscribir() {
    }

    public ControladorEscribir(String ruta) {

        this.ruta = ruta;

    }

    public String getRuta() {

        return ruta;

    }

    public void setRuta(String ruta) {

        this.ruta = ruta;
        /*try {

            
            
        } catch (IOException error) {
            System.out.println("error");
        }*/

    }

}
