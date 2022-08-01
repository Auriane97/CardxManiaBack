package dao;

import java.util.List;

import model.Achat;


public interface IDAOAchat {

public interface IDAOachat extends IDAO<Achat,Integer>{

	public List<Achat> findAllByUser(Integer idUser); 
}


}
