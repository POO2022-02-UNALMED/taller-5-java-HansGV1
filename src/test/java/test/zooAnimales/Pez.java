package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> pez = new ArrayList<>();
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	private static int numPez=0;
	
	public Pez(String nombre, int edad,String habitat, String genero, String colorEscamas, int aletas) {
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=aletas;
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		
	}
	public Pez() {
		numPez++;
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	public static Animal crearSalmon(String nombre, int edad, String genero) {

		pez.add(new Pez(nombre,edad,"oceano",genero,"rojo",6));
		salmones++;
		numPez++;
		return pez.get(pez.size()-1);
		
		
	}
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		pez.add(new Pez(nombre,edad,"oceano",genero,"gris",6));
		bacalaos++;
		numPez++;
		return pez.get(pez.size()-1);
		
	}
	public static int cantidadPeces() {
		numPez = numPez + 1
		return numPez;
	}
	public String getColorEscamas() {
		// TODO Auto-generated method stub
		return this.colorEscamas;
	}
	public int getCantidadAletas() {
		// TODO Auto-generated method stub
		return this.cantidadAletas;
	}
}
