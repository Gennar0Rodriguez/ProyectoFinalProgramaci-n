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
public class Cantante extends Usuario {
    private int cantOyentes;
    private int cantCanciones;
    private Banda banda;
    private List<Cancion> canciones;
    
    public Cantante(String nombre, String nickname, String password, int cantOyentes, int cantCanciones) {
    	super(nombre, nickname, password);
    	this.cantCanciones = cantCanciones;
    	this.cantOyentes = cantOyentes;
    	this.banda = null;
    	this.canciones = new ArrayList<Cancion>();
    }
}
    
