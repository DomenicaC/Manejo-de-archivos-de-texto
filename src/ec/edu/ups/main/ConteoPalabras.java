/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

/**
 *
 * @author Domenica Cañizares
 */
public class ConteoPalabras {

    private String nombre;
    private int repetir;

    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepetir() {
        return repetir;
    }

    public void setRepetir(int repetir) {
        this.repetir = repetir;
    }

    //toString
    @Override
    public String toString() {
        return "ConteoPalabras{" + "nombre=" + nombre + ", repetir=" + repetir + '}';
    }

}
