package cardxMania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.CompteRepository;
import cardxMania.model.Compte;

@Service
public class CompteService {

	

	@Autowired
	private IDAOCompte compteRepo;
	

	public List<Compte> getAll() {
		return compteRepo.findAll();
	}

	public Compte getById(Integer id) {
		return compteRepo.findById(id);
	}

	public Compte create(Compte compte) {
		return compteRepo.save(compte);
	}

	public Compte update(Compte compte) {
		return compteRepo.save(compte);
	}

	public void deleteById(Integer id) {
		compteRepo.deleteById(id);
	}
	
	
}
