package cardxMania.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cardxMania.model.Achat;
import cardxMania.model.Compte;
import cardxMania.model.Exemplaire;


public interface IDAOAchat extends JpaRepository<Achat,Integer>{


	@Transactional
	@Modifying
	@Query("delete from Achat a where a.exemplaire.id=:id")
	public void deleteByIdExemplaire(@Param("id") Integer id);

	@Transactional
	@Modifying
	@Query("update Achat a set a.produit=null where a.exemplaire=:exemplaire")
	public int setNullToExempalireByExemplaire(@Param("exemplaire") Exemplaire exemplaire);
	
}


