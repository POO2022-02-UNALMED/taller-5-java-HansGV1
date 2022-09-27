package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> reptil = new ArrayList<>();
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	private static int numReptil=1; 
	
	public Reptil(String nombre, int edad,String habitat, String genero, String colorEscamas, int cola) {
		this.colorEscamas=colorEscamas;
		this.largoCola=cola;
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
			
	}
	public Reptil() {
		numReptil++;
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre, int edad, String genero) {
		reptil.add(new Reptil(nombre,edad,"humedal",genero,"verde",3));
		numReptil++;	
		iguanas++;
		return reptil.get(reptil.size()-1);
		
	}
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		reptil.add( new Reptil(nombre,edad,"jungla",genero,"blanco",1));
		numReptil++;	
		serpientes++;
		return reptil.get(reptil.size()-1);
		
	}
	public static int cantidadReptiles() {
		return numReptil;
	}
	public String getColorEscamas() {
		// TODO Auto-generated method stub
		return this.colorEscamas;
	}
	public int getLargoCola() {
		// TODO Auto-generated method stub
		return this.largoCola;
	}
	
}