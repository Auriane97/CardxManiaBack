package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import context.Singleton;
import model.Exemplaire;


public class DAOExemplaire implements IDAO<Exemplaire,Integer> {
	
	public Exemplaire findById(Integer id) {
		Exemplaire m = null;
		EntityManager em = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			m = em.find(Exemplaire.class, id);
		}
		catch(Exception e) {e.printStackTrace();}
		finally {
			if(em!=null) {em.close();}
		}

		return m;
	}

	
	public List<Exemplaire> findAll() {
		List<Exemplaire> Exemplaires =new ArrayList();
		EntityManager em = null;
		try {

			em = Singleton.getInstance().getEmf().createEntityManager();
			Exemplaires = em.createQuery("from Exemplaire").getResultList();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			if(em!=null) 
			{
				em.close();
			}
		}
		return Exemplaires;
	}

	public Exemplaire save(Exemplaire p) {

		EntityManager em = null;
		EntityTransaction tx = null;
		try 
		{
			em = Singleton.getInstance().getEmf().createEntityManager();
			tx=em.getTransaction();
			tx.begin();
			p = em.merge(p);
			tx.commit();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		}
		finally 
		{
			if(em!=null) 
			{
				em.close();
			}
		}
		return p;

	}

	
	public void delete(Integer id) {

		EntityManager em = null;
		EntityTransaction tx = null;
		try 
		{
			em = Singleton.getInstance().getEmf().createEntityManager();
			tx=em.getTransaction();
			tx.begin();
			Exemplaire m = em.find(Exemplaire.class, id);
			em.remove(m);
			tx.commit();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		}
		finally 
		{
			if(em!=null) 
			{
				em.close();
			}
		}
	
	}

	
	public List<Exemplaire> findAllByUser(Integer id) {
		List<Exemplaire> Exemplaire = new ArrayList();
		EntityManager em = null;
		try {

			em = Singleton.getInstance().getEmf().createEntityManager();
			Exemplaire = em.createQuery("SELECT s from Exemplaire s where s.user.id=:id").setParameter("id", id).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return Exemplaire;
	}

}
