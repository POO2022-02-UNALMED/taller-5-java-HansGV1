package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> anfibio = new ArrayList<>();
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
	private static int numAnfi=1;
	
	public Anfibio(String nombre, int edad,String habitat, String genero, String color,boolean veneno) {
		this.colorPiel=color;
		this.venenoso=veneno;
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		
	}
	public Anfibio() {
		numAnfi++;
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
	public static Animal crearRana(String nombre, int edad, String genero) {
		anfibio.add( new Anfibio(nombre, edad, "selva",genero,"rojo",true));
		ranas++;
		numAnfi++;
		return anfibio.get(anfibio.size()-1);
		
	}
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		anfibio.add( new Anfibio(nombre, edad, "selva",genero,"negro y amarillo",false));
		salamandras++;
		numAnfi++;
		return anfibio.get(anfibio.size()-1);
		
	}
	public static int cantidadAnfibios() {
		return numAnfi;
	}
	public boolean isVenenoso() {
		return this.venenoso;
	}
	public String  getColorPiel() {
		return this.colorPiel;
	}
	public String getNombre() {
		return super.getNombre();
	}
	
}

