package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Carte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer IdCarte;
	
	protected int cote;
	//private byte photo;
	private String description;
	private Serie serie;
	
	
	public Carte() {}

	public Carte(int cote, String description, Serie serie) {
		this.cote = cote;
		this.description = description;
		this.serie = serie;
	}

	public int getCote() {
		return cote;
	}

	public String getDescription() {
		return description;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	
	public Integer getIdCarte() {
		return IdCarte;
	}

	public void setIdCarte(Integer idCarte) {
		IdCarte = idCarte;
	}

	public String toString() {
		return "Carte [cote=" + cote + ", description=" + description + ", serie=" + serie + "]";
	}
	
	
	
	
}
