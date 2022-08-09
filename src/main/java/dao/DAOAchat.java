package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import context.Singleton;
import model.Achat;

public class DAOAchat implements IDAOAchat{

	@Override
	public Achat findById(Integer id) {
		Achat a = null;
		EntityManager em = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			a = em.find(Achat.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return a;
	}

	@Override
	public List<Achat> findAll() {
		List<Achat> achats = new ArrayList();
		EntityManager em = null;
		try {

			em = Singleton.getInstance().getEmf().createEntityManager();
			achats = em.createQuery("from achat").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return achats;
	}

	@Override
	public Achat save(Achat a) {

		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			a = em.merge(a);
			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return a;

	}

	@Override
	public void delete(Integer id) {

		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			Achat a = em.find(Achat.class, id);
			em.remove(a);
			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	
	public List<Achat> findAllById(Integer id) {
		List<Achat> achats = new ArrayList();
		EntityManager em = null;
		try {

			em = Singleton.getInstance().getEmf().createEntityManager();
			achats = em.createQuery("SELECT a from achat a where a.user.id=:id").setParameter("id", id).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return achats;
	}

	@Override
	public Achat insert(Achat o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Achat update(Achat o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
