package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Exemplaire {

	@Column(name="en_vente")
	private boolean enVente;
	
	@Column(name="valeur_exempalire")
	private Integer valeurExemplaire;
	
	@ManyToOne
	private Carte carte;
	
	@ElementCollection(targetClass = Etat.class,fetch = FetchType.EAGER)
	@JoinTable(name = "etat", joinColumns = @JoinColumn(name = "exemplaire"))
	@Column(name = "etat", nullable = false,columnDefinition = "ENUM('Abimee','BonEtat','Neuf')")
	@Enumerated(EnumType.STRING)
	private Etat etat;
	
	@OneToMany
	private List<Carte> cartes=new ArrayList();
	
	public Exemplaire() {}
	
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
