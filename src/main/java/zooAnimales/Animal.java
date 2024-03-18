package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;



public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> listado = new ArrayList<>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal() {}
	
	public String movimiento() {
		
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + (Mamifero.cantidadMamiferos()) +"\n"+"Aves: "+(Ave.cantidadAves())+"\n"+"Reptiles: "+(Reptil.cantidadReptiles())+"\n"+"Peces: "+(Pez.cantidadPeces())+"\n"+"Anfibios: "+(Anfibio.cantidadAnfibios()); 
		
	}
	
	public String toString(){
		
		if (listado.size()!=0)
			
		return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+", y mi genero es "+
		
				this.genero+", la zona en la que me ubico es "+this.listado.get(0).getNombre()+", en el "+this.listado.get(0).getZoo().getNombre();
		else
			
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public String getHabitat() {
		
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		
		this.habitat = habitat;
	}
	
	public String getGenero() {
		
		return genero;

	}
	
	public void setgenero (String genero) {
		
		this.genero = genero;
	}
	
	public static void setTotalAnimales() {
		
		totalAnimales++;
	}
	
	public static int getTotalAnimales() {
		
		return Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Anfibio.cantidadAnfibios()+Pez.cantidadPeces();
	}
	

}