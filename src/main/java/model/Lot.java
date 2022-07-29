package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lot {

	
	private int note;

	@ManyToOne
	private List<User> acheteur = new ArrayList();
	@ManyToOne
	private List<User> vendeur = new ArrayList();

	
	
	
	public Lot(int note, List<User> acheteur, List<User> vendeur) {
		super();
		this.note = note;
		this.acheteur = acheteur;
		this.vendeur = vendeur;
	}
	
	public Lot() {
	}

	public int getNote() {
		return note;
	}

	public List<User> getAcheteur() {
		return acheteur;
	}

	public List<User> getVendeur() {
		return vendeur;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public void setAcheteur(List<User> acheteur) {
		this.acheteur = acheteur;
	}

	public void setVendeur(List<User> vendeur) {
		this.vendeur = vendeur;
	}


	@Override
	public String toString() {
		return "Lot [note=" + note + ", acheteur=" + acheteur + ", vendeur=" + vendeur + "]";
	}

	

	

	

}
