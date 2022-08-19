package cardxMania.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cardxMania.model.Exemplaire;

public interface IDAOExemplaire extends JpaRepository<Exemplaire,Integer> {
	
	@Query("select e from Exemplaire e where e.user.id=:id")
	public List <Exemplaire> findByUser(@Param("id") Integer id);

	@Query("select e from Exemplaire e where e.carte.id=:id")
	public List <Exemplaire> findByCarte(@Param("id") Integer id);
	
	public List<Exemplaire> findByEtat(String etat);
	
	public List<Exemplaire> findByValeurExemplaire(Integer prix);

	@Query("select e from Exemplaire e where e.enVente=TRUE")
	public List<Exemplaire> findByEnVente(@Param("TRUE") boolean enVente );
}
