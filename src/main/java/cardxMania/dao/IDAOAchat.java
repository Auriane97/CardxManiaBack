package cardxMania.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cardxMania.model.Achat;


public interface IDAOAchat extends JpaRepository<Achat,Integer>{


	@Transactional
	@Modifying
	@Query("delete from Achat a where a.achat.id=:id")
	public void deleteByIdachat(@Param("id") Integer id);

	@Transactional
	@Modifying
	@Query("update Achat a set a.achat=null where a.achat=:achat")
	public int setNullToAchatByAchat(@Param("achat") Achat achat);
	
}


