package ar.edu.unlp.info.oo1.balanzaMejorada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private List<Producto> productos;
	private LocalDate fecha;
	
	public Ticket(List<Producto> productos) {
		this.productos = new ArrayList<>();
		for (Producto p : productos){
			this.productos.add(new Producto(p.getDescripcion(), p.getPeso(), p.getPrecioPorKilo()));
		}
		this.fecha = LocalDate.now();
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPesoTotal() {
		return productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}

	public double getPrecioTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
}