package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements CaraBasal{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return  this.getLado() * this.getLado();
	}
	
	public double getPerimetro() {
		return 4 * this.getLado();
	}
}
