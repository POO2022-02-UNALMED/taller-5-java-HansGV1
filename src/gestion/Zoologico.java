package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private  List<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	public Zoologico() {
		
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion= ubicacion;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setZona(Zona zona) {
		zonas.add(zona);
	}
	public List<Zona> getZona(){
		return zonas;
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int numAnimal=0;
		for (int i=0; i<=zonas.size()-1;i++){
			numAnimal=numAnimal + zonas.get(i).cantidadAnimales();
		}
		return numAnimal;
	}

}
