package cardxMania.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOLot;
import cardxMania.model.Lot;


	@Service
	public class LotService {

		
		@Autowired
		private IDAOLot lotRepo;
		
		public Lot update(Lot lot) {
			
			
			return lotRepo.save(lot);
		}

		
		
}
