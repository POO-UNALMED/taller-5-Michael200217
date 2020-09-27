package gestion;
import java.util.*;

import zooAnimales.*;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal>animales=new ArrayList<Animal>();
	Zona(String nombre,Zoologico zoo,Animal animales){
		this.nombre=nombre;
		this.zoo=zoo;
		this.animales.add(animales);
	}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		int z=animales.size();
		return z;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
}
