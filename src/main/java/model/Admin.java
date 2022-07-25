package model;

public class Admin extends Compte {

	public Admin(String pseudo, String password) {
		super(pseudo, password);

	}

	
	public String toString() {
		return "Admin [pseudo=" + pseudo + ", password=" + password + "]";
	}
	

}
