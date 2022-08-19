package cardxMania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOExemplaire;
import cardxMania.exception.ExemplaireException;
import cardxMania.model.Exemplaire;
import eshop.exception.ProduitException;


	@Service
	public class ExemplaireService {

		
		@Autowired
		private IDAOExemplaire exemplaireRepo;
		
		

		public List<Exemplaire> getAll() {
			return exemplaireRepo.findAll();
		}
		
		
		public List<Exemplaire> getAllByCarte() {
			return exemplaireRepo.findAllByCarte();
		}
		
			
		public Exemplaire getById(Integer id) {
			return exemplaireRepo.findById(id).orElseThrow(() -> {
				throw new ExemplaireException("id exemplaire inconnu");
			});
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

		public List<Exemplaire> getByVendeur(Integer id) {
			return exemplaireRepo.findByVendeur(id).orElseThrow(() -> {
				throw new ExemplaireException("id vendeur inconnu");
			});
		}
		
		public List<Exemplaire> getByEtat(int valeur) {
			return exemplaireRepo.findByEtat(valeur).orElseThrow(() -> {
				throw new ExemplaireException("etat non renseigné");
			});
		}
		
		public List<Exemplaire> getByValeurExemplaire(double valeurExemplaire) {
			return exemplaireRepo.findByValeurExemplaire(valeur).orElseThrow(() -> {
				throw new ExemplaireException("etat non renseigné");
			});
		}
		
}
