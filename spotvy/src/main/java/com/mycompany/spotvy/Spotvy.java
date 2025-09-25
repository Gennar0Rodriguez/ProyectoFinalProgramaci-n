/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.spotvy;

import logica.Usuario;
import logica.Cantante;
import logica.Cancion;
import logica.Banda;
import Manejadores.ManejadorCanciones;
import java.util.Scanner;
import Manejadores.ManejadorUsuario;

/**
 *
 * @author Gennaro Rodriguez
 */
public class Spotvy {

    public static void main(String[] args) {
        
        System.out.println("--------------");
        
        // DEMO    
        Cancion can = new Cancion("SeFueTv");
        ManejadorCanciones mc = ManejadorCanciones.getInstance();
        mc.agregarCancion(can);
        mc.printCanciones();
        //
        
        System.out.println("--------------");
        
        // DEMO CON SCANNER
        Scanner cancion = new Scanner(System.in);
        System.out.println("Diga su canción");
        String nc = cancion.nextLine();
        Cancion can2 = new Cancion(nc);
        mc.agregarCancion(can2);
        mc.printCanciones();
        
        System.out.println("--------------");
        
        System.out.println("Usuarios actualmente:");
        Cantante system = new Cantante("system", "nahuel", "123", 0, 0);
        ManejadorUsuario nu = ManejadorUsuario.getInstance();
        nu.agregarUsuario(system);
        nu.printUsuarios();
        
        Usuario usuario = nu.getUsuario("system");
        if(usuario instanceof Cantante){
            Cantante c = (Cantante) usuario;
        c.agregarCancion(can2);
        }
    }
}
