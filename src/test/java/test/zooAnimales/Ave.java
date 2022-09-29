package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> ave = new ArrayList<>();
	public static int aguilas=0;
	public static int halcones=0;
	public String colorPlumas;
	private static int numAves=0;
	
	public Ave(String nombre, int edad,String habitat, String genero, String color) {
		this.colorPlumas= color;
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		
	}
	public Ave() {
		numAves++;	
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		ave.add(new Ave(nombre,edad,"montana",genero,"cafe glorioso"));
		numAves++;		
		halcones++;
		return ave.get(ave.size()-1);
		
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		ave.add(new Ave(nombre,edad,"montana",genero,"blanco y amarillo"));
		numAves++;		
		aguilas++;
		return ave.get(ave.size()-1);
	}
	public static int cantidadAves() {
		numAves = numAves + 1
		return numAves;	
	}
	public String getColorPlumas() {
		
		return this.colorPlumas;
	}	
}
