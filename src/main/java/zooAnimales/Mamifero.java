package zooAnimales;

public class Mamifero extends Animal {
	private static int listado;
	public static int caballos;
	public static int leones;
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
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero horse=new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return horse;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero lion=new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
		return lion;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Mamifero.listado = listado;
	}
	private boolean isPelaje() {
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
