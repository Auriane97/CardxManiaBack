package cardxMania.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cardxMania.model.Exemplaire;

public interface IDAOExemplaire extends JpaRepository<Exemplaire,Integer> {
	
	@Query("select e from Exemplaire e where e.user.id=:id")
	public void findAllByUser(Integer id);

}
