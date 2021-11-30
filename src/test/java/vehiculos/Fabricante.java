package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		listado.add(this);
	}
	
	public Fabricante() {
		this(null, null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.getListado();
		ArrayList<Integer> ventas = new ArrayList<Integer>();
		for(Fabricante f: listado) {
			int c = 0;
			for(Vehiculo v: vehiculos) {
				if(f.getNombre().equals(v.getFabricante().getNombre())) {
					c++;
				}
			}
			ventas.add(c);
		}
		
		int mayor = 0;
		for(int v: ventas) {
			if(v > mayor) {
				mayor = v;
			}
		}
		
		return listado.get(ventas.indexOf(mayor));
	}
}
