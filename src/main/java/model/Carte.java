package model;

public class Carte {
	
	protected int cote;
	//private byte photo;
	private String description;
	private Serie serie;
	
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

	
	
	public String toString() {
		return "Carte [cote=" + cote + ", description=" + description + ", serie=" + serie + "]";
	}
	
	
	
	
}
