package ar.edu.unlp.info.oo1.genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero() {}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) {
			return this.getMadre().getPadre();			
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
			return this.getMadre().getMadre();
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null) {
			return this.getPadre().getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null) {
			return this.getPadre().getMadre();
		}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		//this.getMadre().getIdentificador().equals(mamifero.getIdentificador()) ??
		if (this.getMadre() != null && this.getMadre() == mamifero) {
			return true;
		}
		
		//this.getPadre().getIdentificador().equals(mamifero.getIdentificador()) ??
		if (this.getPadre() != null && this.getPadre() == mamifero) {
			return true;
		}
		
		if (this.getMadre() != null && this.getMadre().tieneComoAncestroA(mamifero)) {
			return true;
		}
		
		if (this.getPadre() != null && this.getPadre().tieneComoAncestroA(mamifero)) {
			return true;
		}
		
		return false;
	}
}
