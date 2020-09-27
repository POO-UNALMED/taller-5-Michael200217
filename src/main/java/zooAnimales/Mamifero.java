package zooAnimales;

public class Mamifero extends Animal {
	private static int listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	public Mamifero(){
		listado++;
	}
	public int cantidadMamiferos() {
		int z=caballos+leones;
		return z;
	}
	public void crearCaballo(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.pelaje=true;
		this.patas=4;
		this.setHabitat("pradera");
		caballos++;
	}
	public void crearLeon(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.pelaje=true;
		this.patas=4;
		this.setHabitat("selva");
		leones++;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Mamifero.listado = listado;
	}
	private boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
