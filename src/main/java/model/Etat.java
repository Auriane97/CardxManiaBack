package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public enum Etat {

	Abimee(1), BonEtat(10), Neuf(100);

	@Column(name="etat")
	private int valeur;
	
	private Etat () {
		
	}
	private Etat(int valeur) {
		this.setValeur(valeur);
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	

}
