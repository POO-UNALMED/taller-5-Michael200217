package zooAnimales;
public class Ave extends Animal{
	private static int listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public Ave(){
		listado++;
	}
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
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
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave halcon=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave aguila=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return aguila;
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
