package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal(String nombre,int edad,String habitat,String genero){
		totalAnimales++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}
	public Animal(){
		totalAnimales++;
	}
	public String movimiento() {
		String z="desplazarse";
		return z;
	}
	public static String totalPorTipo() {
		String x="Mamiferos: "+Mamifero.getListado()+"/n"+"Aves: "+Ave.getListado()+"/n"+"Reptiles: "+Reptil.getListado()+"/n"+"Peces: "+Pez.getListado()+"/n"+"Anfibios: "+Anfibio.getListado();
		return x;
	}
	@Override
	public String toString() {
		if(zona==null) {
			String z="Mi nombre es "+this.getNombre()+", tengo una edad de " +this.edad+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
			return z;
		}
		else {
			String z="Mi nombre es "+this.getNombre()+", tengo una edad de " +this.edad+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.getZona()+", en el "+this.zona.getZoo();
			return z;
		}
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
