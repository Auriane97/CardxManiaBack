package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Achat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdAcheteur;
	
	private LocalDate dateAchat;
	
	@OneToMany (mappedBy="Achat")
	private List<Lot> lot =new ArrayList();
	
	
	
	public Achat() {}


	public Achat(LocalDate dateAchat) {
		super();
		this.dateAchat = dateAchat;
		
	}
	
	
	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}
	
	
	public Integer getIdAcheteur() {
		return IdAcheteur;
	}


	public void setIdAcheteur(Integer idAcheteur) {
		IdAcheteur = idAcheteur;
	}


	public List<Lot> getLot() {
		return lot;
	}


	public void setLot(List<Lot> lot) {
		this.lot = lot;
	}


	@Override
	public String toString() {
		return "Achat [IdAcheteur=" + IdAcheteur + ", dateAchat=" + dateAchat + "]";
	}



}
