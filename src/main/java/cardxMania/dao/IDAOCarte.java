package cardxMania.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cardxMania.model.Carte;

public interface IDAOCarte extends JpaRepository<Carte,Integer>{
	

}
