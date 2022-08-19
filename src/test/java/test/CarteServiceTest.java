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
import cardxMania.model.Serie;
import cardxMania.service.CarteService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@Transactional
public class CarteServiceTest {

	@Autowired
	private CarteService carteService;
		
	
	@Test
	@Commit
	public void carteCreation() {
		carteService.create(new Carte(10, "Je suis la première carte test Magic.", Serie.Magic));
		carteService.create(new Carte(20, "Je suis la première carte test Panini.", Serie.Panini));
		carteService.create(new Carte(50, "Je suis la première carte test Pokemon.", Serie.Pokemon));
		carteService.create(new Carte(5, "Je suis la première carte test Yugioh.", Serie.Yugioh));
	}
}
