package cardxMania.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cardxMania.model.Compte;

public interface IDAOCompte extends JpaRepository<Compte,Integer> {
	
	@Query("select from Compte c where c.login=:login")
	public Optional<Compte> seConnecter(@Param("login") String login);
	
		
	@Modifying
	@Transactional
	@Query("delete from Compte c where c.login=:login")
	public void deleteByCompte(@Param("login") String login);
}
