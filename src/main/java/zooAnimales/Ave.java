package zooAnimales;
import java.util.*;
public class Ave extends Animal{
	private static int listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	Ave(){
		listado++;
	}
	Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas=colorPlumas;
	}
	public int cantidadAves() {
		int z=halcones+aguilas;
		return z;
	}
	public String movimiento() {
		String z="volar";
		return z;
	}
	public void crearHalcon(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorPlumas="cafe glorioso";
		this.setHabitat("montañas");
		halcones++;
	}
	public void crearAguila(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorPlumas="blanco y amarillo";
		this.setHabitat("montanas");
		aguilas++;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
