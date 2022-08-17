package cardxMania.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cardxMania.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, Integer> {

}
