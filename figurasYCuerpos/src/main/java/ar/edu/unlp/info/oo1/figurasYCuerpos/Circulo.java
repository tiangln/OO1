package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements CaraBasal{
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
}
