package ar.edu.unlp.info.oo1.cuentaConGanchos;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro() {
		super();
	}

	public void depositar(double monto) {
		monto -= (monto * 0.02);
		super.depositar(monto);
	}
	
	protected boolean puedeExtraer(double monto) {
		if(this.getSaldo() >= monto + (monto * 0.02)) {
			return true;
		}
		return false;
	}
	
	protected void extraerSinControlar(double monto) {
		monto += (monto * 0.02);
		super.extraerSinControlar(monto);
	}

}
