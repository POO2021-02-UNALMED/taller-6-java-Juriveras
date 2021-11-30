package vehiculos;

public class Pais {
	
	private String nombre;
	
	public Pais(String nombre) {
		this.setNombre(nombre);
	}
	
	public Pais() {
		this(null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}