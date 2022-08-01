package model;

import javax.persistence.Entity;

@Entity
public class Admin extends Compte {

	
	public Admin(String pseudo, String password) {
		super(pseudo, password);

	}
	public Admin() {}
	
	public String toString() {
		return "Admin [pseudo=" + pseudo + ", password=" + password + "]";
	}
	

}
