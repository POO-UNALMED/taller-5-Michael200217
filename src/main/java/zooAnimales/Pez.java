package zooAnimales;
public class Pez extends Animal{
	private static int listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	public Pez(){
		listado++;
	}
	
	public int cantidadPeces() {
		int z=bacalaos+salmones;
		return z;
	}
	public String movimiento() {
		String z="nadar";
		return z;
	}
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		Pez salmon=new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		Pez bacalao=new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return bacalao;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
