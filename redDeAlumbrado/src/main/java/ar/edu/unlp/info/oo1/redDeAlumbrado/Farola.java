package ar.edu.unlp.info.oo1.redDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean on;
	private List<Farola> neighbors;
	
	public Farola() {
		this.on = false;
		this.neighbors = new ArrayList<>();
	}

	public List<Farola> getNeighbors() {
		return neighbors;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.getNeighbors().contains(otraFarola)) {
			this.getNeighbors().add(otraFarola);
			otraFarola.getNeighbors().add(this);
		}
	}

	public boolean isOn() {
		return this.on;
	}
	
	public boolean isOff() {
		return !this.on;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.on = true;
			for (Farola f : neighbors) {		
				f.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(!this.isOff()) {
			this.on = false;
			for (Farola f : neighbors) {
				f.turnOff();
			}
		}
	}
}
