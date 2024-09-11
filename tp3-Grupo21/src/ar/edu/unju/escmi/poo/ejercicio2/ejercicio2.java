package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<GatoSimple> gatos = new TreeSet<>((g1, g2) -> g1.getNombre().compareTo(g2.getNombre()));
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer a un gato simple");
            System.out.println("3 – Eliminar un gato simple");
            System.out.println("4 – Mostrar todos los gatos");
            System.out.println("5 – Crear gato contrincante para pelear con un gato simple");
            System.out.println("6 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion) {
	            case 1:{
	            	 System.out.print("Ingrese el nombre del gato: ");
	                    String nombre = sc.nextLine();
	                    System.out.print("Ingrese el color del gato: ");
	                    String color = sc.nextLine();
	                    System.out.print("Ingrese el peso del gato: ");
	                    double peso = sc.nextDouble();
	                    System.out.print("Ingrese la raza del gato: ");
	                    sc.nextLine();
	                    String raza = sc.nextLine();
	                    System.out.print("Ingrese la edad del gato: ");
	                    int edad = sc.nextInt();
	                    System.out.print("Ingrese el sexo del gato (M para macho, H para hembra): ");
	                    char sexo = sc.next().charAt(0);
	                    GatoSimple gato = new GatoSimple(color, peso, raza, edad, nombre, sexo);
	                    gatos.add(gato);
	                    break;
	            }
	            case 2:{
	            	System.out.print("Ingrese el nombre del gato al que dará de comer: ");
                    String nombreGatoComida = sc.nextLine();
                    GatoSimple gatoComida = buscarGatoPorNombre(gatos, nombreGatoComida);

                    if (gatoComida != null) {
                        System.out.print("Ingrese la comida que se pasará como parámetro: ");
                        String comida = sc.nextLine();
                        gatoComida.comer(comida);
                    } else {
                        System.out.println("Gato no encontrado.\n");
                    }
                    break;
	            }
	            case 3:{
	            	System.out.print("Ingrese el nombre del gato a eliminar: ");
                    String nombreGatoEliminar = sc.nextLine();
                    GatoSimple gatoEliminar = buscarGatoPorNombre(gatos, nombreGatoEliminar);

                    if (gatoEliminar != null) {
                        gatos.remove(gatoEliminar);
                        System.out.println("Gato eliminado con éxito.\n");
                    } else {
                        System.out.println("Gato no encontrado.\n");
                    }
                    break;
	            }
	            case 4:{
	            	System.out.println("Lista de gatos:");
                    gatos.forEach(g -> {
                        System.out.println("Nombre: " + g.getNombre());
                        System.out.println("Color: " + g.getColor());
                        System.out.println("Peso: " + g.getPeso());
                        System.out.println("Raza: " + g.getRaza());
                        System.out.println("Edad: " + g.getEdad());
                        System.out.println("Sexo: " + g.getSexo());
                        g.maullar();
                        g.ronronear();
                        System.out.println();
                    });
                    break;
	            }
	            case 5:{
	            	System.out.print("Ingrese el nombre del gato contrincante: ");
                    String nombreContrincante = sc.nextLine();
                    System.out.print("Ingrese el color del gato contrincante: ");
                    String colorContrincante = sc.nextLine();
                    System.out.print("Ingrese el peso del gato contrincante: ");
                    double pesoContrincante = sc.nextDouble();
                    System.out.print("Ingrese la raza del gato contrincante: ");
                    sc.nextLine();
                    String razaContrincante = sc.nextLine();
                    System.out.print("Ingrese la edad del gato contrincante: ");
                    int edadContrincante = sc.nextInt();
                    System.out.print("Ingrese el sexo del gato contrincante (M para macho, H para hembra): ");
                    char sexoContrincante = sc.next().charAt(0);

                    GatoSimple gatoContrincante = new GatoSimple(colorContrincante, pesoContrincante, razaContrincante, edadContrincante, nombreContrincante, sexoContrincante);
                    gatos.add(gatoContrincante);

                    System.out.print("Ingrese el nombre del gato con el que peleará el gato contrincante: ");
                    String nombreGatoPelea = sc.nextLine();
                    GatoSimple gatoPelea = buscarGatoPorNombre(gatos, nombreGatoPelea);

                    if (gatoPelea != null) {
                        gatoPelea.pelear(gatoContrincante);
                    } else {
                        System.out.println("Gato no encontrado para pelear.\n");
                    }
                    break;
	            }
	            case 6:{
	            	System.out.println("Fin de programa. ");
	            	break;
	            }
	            default:
	            	System.out.println("Opcion incorrecta");
            }
            
        }while(opcion != 6);
        sc.close();
	}
	
	private static GatoSimple buscarGatoPorNombre(TreeSet<GatoSimple> gatos, String nombre) {
        return gatos.stream()
                .filter(gato -> gato.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
}
