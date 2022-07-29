package model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class User extends Compte {
	
	
	
	
	@OneToMany
	private Exemplaire exemplaire;
	
	
	public User(String pseudo, String password, String mail, Integer code, Integer total) {
		super(pseudo, password, mail, code, total);
		this.total += exemplaire.getValeurExemplaire();
	}

	public User(String pseudo, String password) {
		super(pseudo,password);
	}

	public User() {
		
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "User [mail=" + mail + ", code=" + code + ", total=" + total + ", pseudo=" + pseudo + ", password="
				+ password + "]";
	}
	
	
	
}
