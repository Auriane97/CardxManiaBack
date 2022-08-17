package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Carte;

public interface IDAOCarte extends JpaRepository<Carte,Integer>{
	

}
