package ar.edu.unju.escmi.poo.ejercicio4;

public class Cliente {
	private String dni;
	private String nombre;
	private char categoria;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getCategoria() {
		return categoria;
	}
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public Cliente(String dni, String nombre, char categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	
	
}
