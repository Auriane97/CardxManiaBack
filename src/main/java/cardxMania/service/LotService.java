package cardxMania.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOLot;
import cardxMania.exception.LotException;
import cardxMania.model.Lot;


	@Service
	public class LotService {

		
		@Autowired
		private IDAOLot lotRepo;
		
		public Lot getById(Integer id) {
			return lotRepo.findById(id).orElseThrow(LotException::new);
		}
		
		public Lot update(Lot lot) {
			
			
			return lotRepo.save(lot);
		}

		public Lot create(Lot lot) {
			return lotRepo.save(lot);
		}

		

		public void deleteById(Integer id) {
			lotRepo.deleteById(id);
		}
		
}
