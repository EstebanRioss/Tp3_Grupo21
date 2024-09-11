package ar.edu.unju.escmi.poo.ejercicio4;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Cliente> clientes = new HashMap<>();
		Scanner sc = new Scanner(System.in);
        int opcion = 0;
		
        do {
        	System.out.println("Menú de Opciones:");
            System.out.println("1 – Alta cliente");
            System.out.println("2 – Mostrar todos los clientes");
            System.out.println("3 – Ingrese clave para eliminar cliente");
            System.out.println("4 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
	            case 1:
	                System.out.print("Ingrese el DNI del cliente: ");
	                String dni = sc.nextLine();
	                System.out.print("Ingrese el nombre del cliente: ");
	                String nombre = sc.nextLine();
	                System.out.print("Ingrese la categoria del cliente: ");
	                char categoria = sc.nextLine().charAt(0);
	                sc.nextLine();
	
	                Cliente nuevoCliente = new Cliente(nombre, dni, categoria);
	                clientes.put(dni, nuevoCliente);
	                System.out.println("Cliente agregado con éxito.\n");
	                break;
	
	            case 2:
	            	if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para mostrar.\n");
                    } else {
                        System.out.println("Lista de clientes:");
                        for (String clave : clientes.keySet()) {
                            Cliente cliente = clientes.get(clave);
                            System.out.println("DNI: " + clave + " - Nombre: " + cliente.getNombre() + " - Categoría: " + cliente.getCategoria());
                        }
                        System.out.println();
                    }
                    break;
	            case 3:
	                // Eliminar cliente
	            	 System.out.print("Ingrese el dni del cliente a eliminar: ");
	                    String clave = sc.nextLine();
	                    if (clientes.containsKey(clave)) {
	                        clientes.remove(clave);
	                        System.out.println("Cliente eliminado con éxito.\n");
	                    } else {
	                        System.out.println("Cliente no encontrado.\n");
	                    }
	                    break;
	
	            case 4:
	                // Salir
	                System.out.println("fin del programa.");
	                break;
	
	            default:
	                System.out.println("Opción incorrecta. \n");
        }
        }while (opcion != 4);
        sc.close();
	}

}
