package zooAnimales;
public class Pez extends Animal{
	private static int listado;
	public int salmones;
	public int bacalaos;
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
	public void crearSalmon(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorEscamas="rojo";
		this.cantidadAletas=6;
		this.setHabitat("oceano");
		salmones++;
	}
	public void crearBacalao(String nombre,int edad,String genero) {
		this.colorEscamas="gris";
		this.cantidadAletas=6;
		this.setHabitat("oceano");
		bacalaos++;
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
