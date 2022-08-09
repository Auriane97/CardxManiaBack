package dao;

import java.util.List;


import model.Achat;
import model.Compte;


public interface IDAOAchat extends IDAO<Achat,Integer>{

	public List<Achat> findAllById(Integer id); 
	public Compte findByIdwithCompte(Integer id);
	

	
}


