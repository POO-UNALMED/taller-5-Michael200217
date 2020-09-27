package zooAnimales;
public class Anfibio extends Animal{
	private static int listado;
	public static int ranas;
	public static int salamandras;
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
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		Anfibio rana=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		Anfibio salamandra=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return salamandra;
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
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
