package model;

public class User extends Compte {
	
	private Exemplaire exemplaire;
	
	

	public User(String pseudo, String password, String mail, Integer code, Integer total) {
		super(pseudo, password, mail, code, total);
		this.total += exemplaire.getValeurExemplaire();
	}

	public User(String pseudo, String password) {
		super(pseudo,password);
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
