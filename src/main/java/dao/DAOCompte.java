package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import gEvent.context.Singleton;
import model.Admin;
import model.Compte;
import model.User;

public class DAOCompte implements IDAOCompte {

	

	@Override
	public Compte findById(Integer id) {
		Compte m = null;
		EntityManager em = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			m = em.find(Compte.class, id);
		}
		catch(Exception e) {e.printStackTrace();}
		finally {
			if(em!=null) {em.close();}
		}

		return m;
	}

	@Override
	public List<Compte> findAll() {
		public List<Compte> findAll() {
			List<Compte> personnes =new ArrayList();
			EntityManager em = null;
			try {

				em = Singleton.getInstance().getEmf().createEntityManager();
				personnes = em.createQuery("from Compte").getResultList();
			}catch(Exception e) {e.printStackTrace();}
			finally {
				if(em!=null) 
				{
					em.close();
				}
			}
			return personnes;
		}


public Compte seConnecter(String pseudo,String password) 
	{
		Compte c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn=DriverManager.getConnection(urlBdd, loginBdd,passwordBdd); 
			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where pseudo=? and password=?");
			ps.setString(1,pseudo);
			ps.setString(2, password);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				if(rs.getString("type_compte").equals("Admin"))	
				{
					c = new Admin(pseudo,password);
				}
				else 
				{
					c = new User(pseudo,password);
				}
			}

			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		}

@Override
public Compte insert(Compte compte) {
		User u = (User) compte;
		try {
			// Connexion à la BDD
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd, loginBdd, passwordBdd);			

			// Insertion d'un nouvel utilisateur
			PreparedStatement ps = conn.prepareStatement("INSERT INTO compte (pseudo,password,mail,code,total) VALUES (?,?,?,?,?)");
			ps.setString(1, u.getPseudo());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getMail());
			ps.setString(4, u.getCode().toString());
			ps.setString(5, u.getTotal().toString());
		
			System.out.println("L'utilisateur " + u.getPseudo() + " a bien été ajouté !");

			ps.executeUpdate();

			// Clôture des flux
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

@Override
public Compte update(Compte c) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(String pseudo) {
	// TODO Auto-generated method stub
	
}


@Override
public Compte save(Compte o) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(Integer id) {
	// TODO Auto-generated method stub
	
}

}
