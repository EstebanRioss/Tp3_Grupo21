package ar.edu.unju.escmi.poo.ejercicio2;

public class GatoSimple {
	 	private String color;
	    private double peso;
	    private String raza;
	    private int edad;
	    private String nombre;
	    private char sexo;
	    
	    public GatoSimple(String color, double peso, String raza, int edad, String nombre, char sexo) {
	        this.color = color;
	        this.peso = peso;
	        this.raza = raza;
	        this.edad = edad;
	        this.nombre = nombre;
	        this.sexo = sexo;
	    }
	    
	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public String getRaza() {
	        return raza;
	    }

	    public void setRaza(String raza) {
	        this.raza = raza;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public char getSexo() {
	        return sexo;
	    }

	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }
	    
	    public void maullar() {
	        System.out.println("Miauu");
	    }
	    
	    public void ronronear() {
	        System.out.println("prrrr");
	    }
	    
	    public void comer(String comida) {
	        if ("pescado".equals(comida)) {
	            System.out.println("Que rico ¡Gracias!!");
	        } else {
	            System.out.println("Lo siento, yo solo como pescado");
	        }
	    }
	    
	    public void pelear(GatoSimple gatoContrincante) {
	        if (this.sexo == 'H') {
	            System.out.println("No me gusta pelear");
	        } else if (this.sexo == 'M') {
	            if (gatoContrincante.getSexo() == 'H') {
	                System.out.println("no peleo contra gatitas");
	            } else if (gatoContrincante.getSexo() == 'M') {
	                System.out.println("¡Ven aquí que te vas a enterar!");
	            }
	        }
	    }
}
