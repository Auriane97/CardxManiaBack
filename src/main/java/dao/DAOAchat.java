package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Achat;

public class DAOAchat implements IDAOAchat {

	@Override
	public achat findById(Integer id) {
		achat a = null;
		EntityManager em = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			p = em.find(achat.class, idAcheteur);
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
	public List<achat> findAll() {
		List<achat> achats = new ArrayList();
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
	public achat save(achat a) {

		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Singleton.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			p = em.merge(a);
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
			achat a = em.find(achat.class, id);
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

	@Override
	public List<achat> findAllByUser(Integer idUser) {
		List<achat> achats = new ArrayList();
		EntityManager em = null;
		try {

			em = Singleton.getInstance().getEmf().createEntityManager();
			achats = em.createQuery("SELECT a from achat a where a.user.id=:id").setParameter("id", idUser).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return achats;
	}

	

}
