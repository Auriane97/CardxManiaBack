package dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Compte;

public interface IDAOCompte extends JpaRepository<Compte,Integer> {
	
	@Query("select from Compte c where c.login=:login and c.password=:password")
	public void seConnecter(@Param("login") String login, @Param("password") String password);
	
	@Query("")
	public void createCompte();
	
	@Modifying
	@Transactional
	@Query("delete from Compte c where c.login=:login")
	public void deleteByCompte(@Param("login") Compte compte);

}
