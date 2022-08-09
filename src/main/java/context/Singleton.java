package context;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOAchat;
import dao.DAOAdmin;
import dao.DAOCompte;
import dao.DAOExemplaire;
import dao.DAOUser;
import dao.IDAOAchat;
import dao.IDAOAdmin;
import dao.IDAOCarte;
import dao.IDAOCompte;
import dao.IDAOExemplaire;
import dao.IDAOLot;
import dao.IDAOUser;



public class Singleton {

private EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetFinalBackJPA");
	

	private IDAOAchat daoAchat = new DAOAchat();
	private IDAOCompte daoCompte = new DAOCompte();
	private IDAOCarte daoCarte = new DAOCarte();
	private IDAOExemplaire daoExemplaire = new DAOExemplaire();
	private IDAOLot daoLot = new DAOLot();
	
	

	
	
	
	
	private static Singleton instance;

	
	private Singleton() {}
	
	
	
	public static Singleton getInstance() {
		if(instance == null) 
		{
			instance=new Singleton();
		}
		
		return instance;
	}



	public IDAOAchat getDaoAchat() {
		return daoAchat;
	}



	public void setDaoAchat(IDAOAchat daoAchat) {
		this.daoAchat = daoAchat;
	}





	public IDAOCompte getDaoCompte() {
		return daoCompte;
	}



	public void setDaoCompte(IDAOCompte daoCompte) {
		this.daoCompte = daoCompte;
	}



	public IDAOCarte getDaoCarte() {
		return daoCarte;
	}



	public void setDaoCarte(IDAOCarte daoCarte) {
		this.daoCarte = daoCarte;
	}



	public IDAOExemplaire getDaoExemplaire() {
		return daoExemplaire;
	}



	public void setDaoExemplaire(IDAOExemplaire daoExemplaire) {
		this.daoExemplaire = daoExemplaire;
	}



	



	public IDAOLot getDaoLot() {
		return daoLot;
	}



	public void setDaoLot(IDAOLot daoLot) {
		this.daoLot = daoLot;
	}



	public EntityManagerFactory getEmf() {
		return emf;
	}



	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	
	
	


	
	
	
	

}

