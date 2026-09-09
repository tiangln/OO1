package ar.edu.unlp.info.oo1.balanzaMejorada;

import java.util.ArrayList;
import java.util.List;

public class Balanza {

	private List <Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<>(); 
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPrecioTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}

	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getProductos());
		return ticket;
	}
}
