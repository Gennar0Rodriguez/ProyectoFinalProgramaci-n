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
import logica.Playlist;
import Manejadores.manejadorPlaylist;
import logica.UsuarioFree;
import logica.UsuarioPremium;
import javax.swing.JOptionPane;

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
        System.out.println("Diga su cancion");
        String nc = cancion.nextLine();
        Cancion can2 = new Cancion(nc);
        mc.agregarCancion(can2);
        mc.printCanciones();

        System.out.println("--------------");

        //DEMO CON CREAR UN CANTANTE
        System.out.println("Usuarios actualmente:");
        Cantante system = new Cantante("system", "nahuel", "123", 0, 0);
        ManejadorUsuario nu = ManejadorUsuario.getInstance();
        nu.agregarUsuario(system);
        nu.printUsuarios();

        //DEMO DE VERIFICAR SI ES CANTANTE UN USUARIO
        Usuario usuario = nu.getUsuario("system");
        if (usuario instanceof Cantante) {
            Cantante c = (Cantante) usuario;
            c.agregarCancion(can2);

            //DEMO DE AÑADIR CANCIONES EN PLAYLIST
            System.out.println("--------------");
            Playlist ilyTV = new Playlist("Te extraño tv");
            Cancion can3 = new Cancion("verde");
            ilyTV.agregarCancionAPlaylist(can3);
            ilyTV.printCancionesEnPlaylist();
        }
        //QUE LA PLAYLIST SEA DE X USUARIO Y TENGA X CANCIONES
        System.out.println("--------------");
        UsuarioPremium Gennaro = new UsuarioPremium("Gennaro", "Gennaro", "123");
        Playlist prueba = new Playlist("PruebaPlaylist");
        Cancion pruebaC = new Cancion("Abuelete");
        Gennaro.crearPlaylist(prueba);
        prueba.agregarCancionAPlaylist(pruebaC);
        Gennaro.printPlaylists();
        prueba.printCancionesEnPlaylist();

        //QUE LOS USUARIOSFREE PUEDAN CREAR PLAYLIST
        System.out.println("--------------");
        UsuarioFree usuarioFree = new UsuarioFree("Usuario", "Usuario", "");
        Playlist pruebaFree = new Playlist("PlaylistFree");
        Playlist pruebaFree2 = new Playlist("PlaylistFree2");
        usuarioFree.crearPlaylistFree(pruebaFree);
        usuarioFree.crearPlaylistFree(pruebaFree2);
        pruebaFree.agregarCancionAPlaylist(pruebaC);
        pruebaFree.agregarCancionAPlaylist(can2);
        usuarioFree.printPlaylistsFree();
        pruebaFree.printCancionesEnPlaylist();
    }
}
