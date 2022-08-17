package cardxMania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOExemplaire;
import cardxMania.exception.ExemplaireException;
import cardxMania.model.Exemplaire;


	@Service
	public class ExemplaireService {

		
		@Autowired
		private IDAOExemplaire exemplaireRepo;
		
		

		public List<Exemplaire> getAll() {
			return exemplaireRepo.findAll();
		}
		public Exemplaire getById(Integer id) {
			return exemplaireRepo.findById(id).orElseThrow(ExemplaireException::new);
		}

		public Exemplaire create(Exemplaire exemplaire) {
			return exemplaireRepo.save(exemplaire);
		}

		public Exemplaire update(Exemplaire exemplaire) {
			return exemplaireRepo.save(exemplaire);
		}

		public void deleteById(Integer id) {
			exemplaireRepo.deleteById(id);
		}

}
