package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> mamifero = new ArrayList<>();
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	private static int numMamiferos=0;
	
	
	public Mamifero(String nombre, int edad,String habitat, String genero, boolean pelaje, int patas) {
		this.patas= patas;
		this.pelaje = pelaje;
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
	}
	public Mamifero(){
		numMamiferos++;
	}
	public static int cantidadMamiferos() {
		numMamiferos = numMamiferos + 1
		return numMamiferos;
	}
	public static Animal  crearCaballo(String nombre, int edad, String genero) {
		mamifero.add(new Mamifero(nombre,edad,"pradera",genero,true,4));		
		numMamiferos++;
		caballos++;	
		return mamifero.get(mamifero.size()-1);		
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		mamifero.add(new Mamifero(nombre,edad,"selva",genero,true,4));
		numMamiferos++;
		leones++;
		return mamifero.get(mamifero.size()-1);
		
	}
	public boolean isPelaje() {
		// TODO Auto-generated method stub
		return this.pelaje;
	}
	public int getPatas() {
		// TODO Auto-generated method stub
		return this.patas;
	}
	
}
