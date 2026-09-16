package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private CaraBasal carabasal;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(CaraBasal carabasal) {
		this.carabasal = carabasal;
	}
	
	public double getVolumen() {
		return carabasal.getArea() * this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2 * carabasal.getArea() + carabasal.getPerimetro() * this.getAltura();
	}
}
