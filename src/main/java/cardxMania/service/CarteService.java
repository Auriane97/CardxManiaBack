package cardxMania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOCarte;
import cardxMania.dao.IDAOCompte;
import cardxMania.exception.CarteException;
import cardxMania.model.Carte;
import cardxMania.model.Serie;

@Service
public class CarteService {
	
	@Autowired
	private IDAOCarte carteRepo;
	
	public List<Carte> getAll() {
		return carteRepo.findAll();
	}
	
		
	public Carte getById(Integer id) {
		return carteRepo.findById(id).orElseThrow(() -> {
			throw new CarteException("id carte inconnu");
		});
	}

	public Carte create(Carte carte) {
		return carteRepo.save(carte);
	}

	public Carte update(Carte carte) {
		return carteRepo.save(carte);
	}

	public void deleteById(Integer id) {
		carteRepo.deleteById(id);
	}

	public List<Carte> getBySerie(Serie serie) {
		return carteRepo.findBySerie(serie);
		
	}
	
	//on va chercher les cartes avce le compte user associés
	public Carte getByIdWithCompte(Integer id) {
		return carteRepo.findByIdWithCompte(id).orElseThrow(CarteException::new);
	}

}
