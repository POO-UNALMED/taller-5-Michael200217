package zooAnimales;
public class Reptil extends Animal{
	private static int listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
	}
	public Reptil(){
		listado++;
	}
	public static int cantidadReptiles() {
		int z=serpientes+iguanas;
		return z;
	}
	public String movimiento() {
		String z="reptar";
		return z;
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil iguana=new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil iguana=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return iguana;
	}
	public static int getListado() {
		return listado;
	}
	public static void setListado(int listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
