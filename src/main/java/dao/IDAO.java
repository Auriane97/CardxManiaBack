package dao;

import java.util.List;

import model.Achat;


public interface IDAO<T,K> {
	
	String urlBdd = "jdbc:mysql://localhost:8889/";
	 String loginBdd="root";
	 String passwordBdd ="root";

	public T findById(K id);
	public List<T> findAll();
	public T insert(T o);
	public T update(T o);
	public T save (T o);
	public void delete(K id);
	
	
	
}
