package co.edu.uis;

public class Moto {

	private final String id;
	private String marca;
	private String nombre;
	private String year;
	private String color;

	public Moto(String id, String marca, String nombre, String year, String color) {
		this.id = id;
		this.marca = marca;
		this.nombre = nombre;
		this.year = year;
		this.color = color;

	}

	public String getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}
	public String getNombre() {
		return nombre;
	}
	public String getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setColor(String color) {
		this.color = color;
	}
}