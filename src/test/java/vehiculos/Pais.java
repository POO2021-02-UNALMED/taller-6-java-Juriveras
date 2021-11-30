package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	private String nombre;
	
	public Pais(String nombre) {
		this.setNombre(nombre);
		listado.add(this);
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
	
	public static Pais paisMasVendedor() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.getListado();
		ArrayList<Integer> ventas = new ArrayList<Integer>();
		for(Pais f: listado) {
			int c = 0;
			for(Vehiculo v: vehiculos) {
				if(f.getNombre().equals(v.getFabricante().getPais().getNombre())) {
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
