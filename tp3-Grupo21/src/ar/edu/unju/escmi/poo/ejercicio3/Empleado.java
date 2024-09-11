package ar.edu.unju.escmi.poo.ejercicio3;

public class Empleado {
	private String nombre;
	private String legajo;
	private double salario;
	private static final double SalarioMin = 300000.00;
	private static final double AumentoPorMerito = 10000.00;
	
	public Empleado(String nombre, String legajo, double salario){
		this.nombre = nombre;
		this.legajo = legajo;
		
		if(salario < 300000.00) {
			this.salario = salario;
		}else{
			this.salario = Empleado.SalarioMin;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nombre del  empleado" + this.nombre + "\n" + "Legajo: " + this.legajo + "\n" + "Salario : $" + this.salario;
	}
	
	public void Aumento(){
		this.salario = this.salario + Empleado.AumentoPorMerito;
	}
	
	
}
