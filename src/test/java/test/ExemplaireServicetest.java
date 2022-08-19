package test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cardxMania.config.AppConfig;
import cardxMania.model.Carte;
import cardxMania.model.Etat;
import cardxMania.model.Exemplaire;
import cardxMania.model.Serie;
import cardxMania.model.User;
import cardxMania.service.CarteService;
import cardxMania.service.CompteService;
import cardxMania.service.ExemplaireService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class })
@Transactional
public class ExemplaireServicetest {
	
		
		@Autowired
		private ExemplaireService exemplaireService;
		
		@Autowired
		private CarteService carteService;
		
		@Autowired
		private CompteService compteService;
	
		@Test
		@Commit
		public void test() {
			
		
			
			
			
			exemplaireService.create(new Exemplaire(true,carteService.getById(1),Etat.Abimee,compteService.getById(1)));
			exemplaireService.create(new Exemplaire(true,carteService.getById(2),Etat.BonEtat,compteService.getById(2)));
		}

	
}
