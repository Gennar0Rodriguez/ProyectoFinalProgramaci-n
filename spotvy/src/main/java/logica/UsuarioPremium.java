/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gennaro Rodriguez
 */
public class UsuarioPremium extends Usuario {

    private int cantPlaylist;
    private List<Playlist> playlists;
    

    public UsuarioPremium(String nombre, String nickname, String password) {
        super(nombre, nickname, password);
        this.playlists = new ArrayList<>(); // INICIALIZAR LA LISTA HIJO DE PUTA
    }

    public void setCantPlaylist(int cantPlaylist) {
        this.cantPlaylist = cantPlaylist;
    }

    public void crearPlaylist(Playlist nuevaPlaylist) {
        this.playlists.add(nuevaPlaylist);
        this.cantPlaylist++;
    }

    public void printPlaylists() {
        for (Playlist c : playlists) {
            System.out.println(c.getNombre());
        }
    }
        }
