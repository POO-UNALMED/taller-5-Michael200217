package zooAnimales;
public class Reptil extends Animal{
	private static int listado;
	public int iguanas;
	public int serpientes;
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
	public int cantidadReptiles() {
		int z=serpientes+iguanas;
		return z;
	}
	public String movimiento() {
		String z="reptar";
		return z;
	}
	public void crearIguana(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorEscamas="verde";
		this.largoCola=3;
		this.setHabitat("humedal");
		iguanas++;
	}
	public void crearSerpiente(String nombre,int edad,String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.colorEscamas="blanco";
		this.largoCola=1;
		this.setHabitat("jungla");
		serpientes++;
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
