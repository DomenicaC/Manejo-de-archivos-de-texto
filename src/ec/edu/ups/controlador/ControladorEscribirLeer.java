/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import manejoarchivosdetexto.ConteoPalabras;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorEscribirLeer {

    private String oracion = "";
    private List<ConteoPalabras> lista;

    public ControladorEscribirLeer() {

        lista = new ArrayList<>();

    }

    public void BOW(String ruta) throws IOException {

        try {

            FileReader archivo = new FileReader(ruta);
            BufferedReader leer = new BufferedReader(archivo);

            while (oracion != null) {

                oracion = leer.readLine();
                if (oracion != null) {

                    leerOracion();

                }
            }

        } catch (FileNotFoundException errorArc) {

            System.out.println("Archivo no existe");

        } catch (IOException errorLeer) {

            System.out.println("No se pudo escribir");

        }

    }

    public void contarPalabra(String palabra) {

        int cont = 0;
        for (ConteoPalabras palabra2 : lista) {

            if (palabra2.getNombre().equals(palabra)) {

                palabra2.setRepetir(palabra2.getRepetir() + 1);
                cont++;
                break;

            }
        }

        if (cont == 0) {

            ConteoPalabras conPal = new ConteoPalabras();
            conPal.setNombre(palabra);
            conPal.setRepetir(1);
            lista.add(conPal);

        }
    }

    public void leerOracion() {

        String palabra[] = oracion.split(" ");
        for (int i = 0; i < palabra.length; i++) {

            contarPalabra(palabra[i].toLowerCase());
        }

    }

    public void escribir() throws IOException {

        Collections.sort(lista, new Comparator<ConteoPalabras>() {
            public int compare(ConteoPalabras contPal1, ConteoPalabras contPal2) {
                return contPal1.getNombre().compareTo(contPal2.getNombre());
            }
        });

        try {

            String ruta = "ConteoPalabras.txt";
            FileWriter archivo = new FileWriter(ruta, false);
            BufferedWriter escribir = new BufferedWriter(archivo);

            for (ConteoPalabras contPal : lista) {

                escribir.append(contPal.getNombre() + " " + contPal.getRepetir());
                escribir.newLine();

            }

            escribir.close();
            archivo.close();

        } catch (IndexOutOfBoundsException error) {

            System.out.println("No se pudo escribir");

        }
    }
}
