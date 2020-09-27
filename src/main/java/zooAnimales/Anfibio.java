package zooAnimales;
public class Anfibio extends Animal{
	private static int listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	public Anfibio(){
		listado++;
	}
	
	
	public int cantidadAnfibios() {
		int z=ranas+salamandras;
		return z;
	}
	public String movimiento() {
		String z="saltar";
		return z;
	}
	public void crearRana(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorPiel="rojo";
		this.venenoso=true;
		this.setHabitat("selva");
		ranas++;
	}
	public void crearSalamandra(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorPiel="negro y amarillo";
		this.venenoso=false;
		this.setHabitat("selva");
		salamandras++;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	private boolean getVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
