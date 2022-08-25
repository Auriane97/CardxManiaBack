package cardxMania.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Achat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Exemplaire exemplaire;
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}




	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}




	@ManyToOne
	private Lot lot;
	
	
	
	public Achat() {}

	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Lot getLot() {
		return lot;
	}


	public void setLot(Lot lot) {
		this.lot = lot;
	}




	@Override
	public String toString() {
		return "Achat [Id=" + id + ", lot=" + lot + "]";
	}


	
	



}
