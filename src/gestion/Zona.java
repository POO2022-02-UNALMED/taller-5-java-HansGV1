package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;


public class Zona {
	private String nombre;
	private Zoologico zoo;
	private  List<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;		
	}
	public Zona() {
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public  int cantidadAnimales() {
		return this.animales.size();
	}
	
}