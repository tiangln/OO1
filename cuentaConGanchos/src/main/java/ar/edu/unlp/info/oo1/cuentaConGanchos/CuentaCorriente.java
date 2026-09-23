package ar.edu.unlp.info.oo1.cuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	protected boolean puedeExtraer(double monto) {

		if (this.getSaldo() + this.getDescubierto() >= monto) {
			return true;
		}
		return false;
	}
	
}
