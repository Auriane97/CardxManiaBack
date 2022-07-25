package model;

import java.util.ArrayList;
import java.util.List;

public class Exemplaire {

	private boolean enVente;
	private Integer valeurExemplaire;
	private Carte carte;
	private Etat etat;
	private List<Carte> cartes=new ArrayList();
	
	
	public Exemplaire(boolean enVente, Integer valeurExemplaire, Carte carte, Etat etat) {
		super();
		this.enVente = enVente;
		this.valeurExemplaire = carte.getCote()*etat.getValeur();
		this.carte = carte;
		this.etat = etat;
	}


	public boolean isEnVente() {
		return enVente;
	}


	public Integer getValeurExemplaire() {
		return valeurExemplaire;
	}


	public Carte getCarte() {
		return carte;
	}


	public Etat getEtat() {
		return etat;
	}


	public void setEnVente(boolean enVente) {
		this.enVente = enVente;
	}


	public void setValeurExemplaire(Integer valeurExemplaire) {
		this.valeurExemplaire = valeurExemplaire;
	}


	public void setCarte(Carte carte) {
		this.carte = carte;
	}


	public void setEtat(Etat etat) {
		this.etat = etat;
	}


	@Override
	public String toString() {
		return "Exemplaire [enVente=" + enVente + ", valeurExemplaire=" + valeurExemplaire + ", carte=" + carte
				+ ", etat=" + "etat ]";
	}
	
	
	
	
	
}
