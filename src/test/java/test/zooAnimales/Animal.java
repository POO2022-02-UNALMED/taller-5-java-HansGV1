package zooAnimales;



public class Animal {
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	
	public Animal(String nombre, int edad, String habitat, String genero) {		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		
	}
	
	public Animal() {
		
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String toString() {
		return "Mi nombre es " +Animal.this.getNombre()+", tengo una edad de "+ Animal.this.getEdad()+", habito en "+Animal.this.getHabitat() +" y mi genero es "+Animal.this.getGenero();
	}
	public static String totalPorTipo() {
		return  "Mamiferos: "+Mamifero.cantidadMamiferos()+1+"\n"+
				"Aves: "+Ave.cantidadAves()+2+"\n"+
				"Reptiles: "+Reptil.cantidadReptiles()+1+"\n"+
				"Peces: "+Pez.cantidadPeces()+1+"\n"+
				"Anfibios: "+Anfibio.cantidadAnfibios()+1+"\n";
	}

	public String getNombre() {
		
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		// TODO Auto-generated method stub
		return this.habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		// TODO Auto-generated method stub
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
