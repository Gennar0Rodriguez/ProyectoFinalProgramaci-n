/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejadores;

import java.util.HashMap;
import java.util.Map;

import logica.Cancion;

/**
 *
 * @author Gennaro Rodriguez
 */
public class ManejadorCanciones {
	
    private Map<String, Cancion> cancionesSistema;
	private static ManejadorCanciones instance = null; // Singleton
	
	private ManejadorCanciones() {
		cancionesSistema = new HashMap<String, Cancion>();
	}
	
	public static ManejadorCanciones getInstance() {
		if (instance == null) {
			instance = new ManejadorCanciones();
		}
		return instance;
	}
	
	public void agregarCancion(Cancion c) {
		this.cancionesSistema.put(c.getNombre(), c);
	}
	
	public void printCanciones() {
		for (Cancion c : cancionesSistema.values()) {
			System.out.println(c.getNombre());
		}
	}
	
}
