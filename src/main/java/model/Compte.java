package model;

public abstract class Compte {
	protected Integer code;
	protected String pseudo;
	protected String password;
	protected String mail;
	protected Integer total;
	
	public Compte(String pseudo, String password, String mail, Integer code, Integer total ) {

		this.pseudo = pseudo;
		this.password = password;
		this.mail=mail;
		this.code=code;
		this.total=total;

	}
	

	public Compte(String pseudo, String password) {
		this.pseudo = pseudo;
		this.password = password;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
