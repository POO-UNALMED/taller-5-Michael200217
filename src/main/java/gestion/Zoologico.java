package gestion;
import java.util.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona>zonas=new ArrayList<Zona>();
	Zoologico(String nombre,String ubicacion,Zona zonas){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas.add(zonas);
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int pepe=0;
		for (int i = 0; i < zonas.size(); i++) {
			pepe=pepe+zonas.get(i).cantidadAnimales();
		}
		return pepe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}