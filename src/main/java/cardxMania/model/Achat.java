package cardxMania.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	
	
	@ManyToOne
	private Lot lot;
	
	
	
	public Achat() {}

	
	
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public Lot getLot() {
		return lot;
	}


	public void setLot(Lot lot) {
		this.lot = lot;
	}




	@Override
	public String toString() {
		return "Achat [Id=" + Id + ", lot=" + lot + "]";
	}


	
	



}
