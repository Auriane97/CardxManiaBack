package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@DiscriminatorValue("User")
public class User extends Compte {

	public User() {
		}
	
	
	public User(String pseudo, String password, String mail, Integer code) {
		super(pseudo, password, mail, code);
	}

	public User(String pseudo, String password) {
		super(pseudo,password);
	}


	@Override
	public String toString() {
		return "User [mail=" + mail + ", code=" + code + ", total=" + total + ", pseudo=" + pseudo + ", password="
				+ password + "]";
	}
	
	
}
