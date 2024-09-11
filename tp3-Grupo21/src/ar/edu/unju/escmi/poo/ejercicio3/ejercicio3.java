package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado> empleados= new ArrayList<>();
		int opcion;
		Scanner sc = new Scanner(System.in);
			do{
				System.out.println("Menú de opciones:");
	            System.out.println("1. Crear empleado");
	            System.out.println("2. Aumentar Salario");
	            System.out.println("3. Mostrar la suma total de todos los salarios");
	            System.out.println("4. Mostrar todos los empleados");
	            System.out.println("5. Salir.");
	            System.out.print("Ingrese una opción: ");
	            opcion = sc.nextInt();
	            sc.nextLine();
	        	}while (opcion != 5);
			switch(opcion){
					case 1:{
						String nombre,legajo;
						double salario;
						nombre = sc.nextLine();
						legajo = sc.nextLine();
						salario = sc.nextDouble();
						Empleado aux = new Empleado(nombre, legajo, salario);
						empleados.add(aux);
						break;
					}
					case 2:{
						String legajo;
						legajo = sc.nextLine();
						Empleado aux = BuscarEmpleadoPorLegajo(empleados,legajo);
						if(aux != null) {
							aux.Aumento();
							System.out.println("Aumento aplicado al empleado: " + aux.getNombre());
						}else {
							System.out.println("Empleado no encontrado.");
						}
						break;
					}
					case 3:{
						System.out.println("La suma de los salarios es: " + SumarSalarios(empleados));
						break;
					}
					case 4:{
						for(Empleado e : empleados) {
							e.toString();
						}
						break;
					}
					case 5:{
						System.out.println("Fin de programa.");
						break;
					}
					default:{
						System.out.println("Opcion incorrecta.");
						break;
						}
				}
			
		sc.close();
	}
	public static Empleado BuscarEmpleadoPorLegajo(ArrayList<Empleado>empleados, String legajo){
		for(Empleado e : empleados) {
			if(e.getLegajo().equals(legajo)) {
				return e;
			}
		}
		return null;
	}
	
	public static double SumarSalarios(ArrayList<Empleado>empleados){
		double suma = 0;
		for(Empleado e : empleados) {
			suma += e.getSalario();
		}
		return suma;
	}

}
