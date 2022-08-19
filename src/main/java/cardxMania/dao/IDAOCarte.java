package cardxMania.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cardxMania.model.Carte;
import cardxMania.model.Serie;

public interface IDAOCarte extends JpaRepository<Carte,Integer>{
	
	
	public List <Carte> findBySerie(Serie serie);
	

}
