package logica;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	
	private String nombre;
	private int cantCantantes;
	private List<Cantante> miembros;

	public Banda(String nombre) {
		this.nombre = nombre;
		this.miembros = new ArrayList<Cantante>();
	}
	
	public void agregarMiembro(Cantante nuevoMiembro) {
		this.miembros.add(nuevoMiembro);
		this.cantCantantes++;
	}
	
	public void eliminarMiembro(String miembro) {
		
		boolean encontrado = false;
		int indiceEliminar = 0;
		
		for (Cantante c : miembros) {
			if (c.getNombre().equals(miembro)) {
				encontrado = true;
				break;
			} else {
				indiceEliminar++;
			}
		}
		if (encontrado) this.miembros.remove(indiceEliminar);	
	}
}
