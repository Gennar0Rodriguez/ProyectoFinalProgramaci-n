/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spotvy;

import logica.Usuario;
import logica.Cantante;
import logica.Cancion;
import logica.Banda;
import Manejadores.ManejadorCanciones;

/**
 *
 * @author Gennaro Rodriguez
 */
public class Spotvy {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // DEMO    
        Cancion can = new Cancion("SeFueTv");   
        ManejadorCanciones mc = ManejadorCanciones.getInstance();   
        mc.agregarCancion(can);   
        mc.printCanciones();        
        //
        
       
        
    }
}
