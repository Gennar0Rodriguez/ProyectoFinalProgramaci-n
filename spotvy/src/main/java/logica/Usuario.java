/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Gennaro Rodriguez
 */
public abstract class Usuario {
	private String nombre;
	private String nickname;
	private String password;
	
	public Usuario(String nombre, String nickname, String password) {
		this.nombre = nombre;
		this.nickname = nickname;
		this.password = password;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}


