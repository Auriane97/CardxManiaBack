package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Achat {
	
	private LocalDate dateAchat;
	private List<Lot> lot =new ArrayList();
	
	
	
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
	
	@Override
	public String toString() {
		return "Achat [dateAchat=" + dateAchat + ", lot=" + lot + "]";
	}
	

}
