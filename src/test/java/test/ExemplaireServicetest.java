package test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cardxMania.config.AppConfig;
import cardxMania.model.Admin;
import cardxMania.model.Carte;
import cardxMania.model.Etat;
import cardxMania.model.Exemplaire;
import cardxMania.model.Serie;
import cardxMania.model.User;
import cardxMania.service.ExemplaireService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class })
@Transactional
public class ExemplaireServicetest {
	
		
		@Autowired
		private ExemplaireService exemplaireService;
		
		
	
		@Test
		//@Commit
		public void test() {
			
			User c1 = new User ("Hanz","mdp123","hanz.dong@mail.fr");
			User c2 = new User("John","Dov","JDoe@mail.fr");
			User c3 = new User("Jack","Don","JackDoe@mail.fr");
			User c4 = new User("Jessie","Din12","JessieDoe@mail.fr");
			User c5 = new User("Jason","De66","JasonDoe@mail.fr");
			Admin a1 = new Admin("Jordan","ABID");
			
			Carte carte1  = new Carte(10, "Je suis la première carte test Magic.", Serie.Magic);
			Carte carte2  = new Carte(20, "Je suis la première carte test Panini.", Serie.Panini);
			Carte carte3  = new Carte(50, "Je suis la première carte test Pokemon.", Serie.Pokemon);
			Carte carte4  = new Carte(5, "Je suis la première carte test Yugioh.", Serie.Yugioh);
			
			
			
			ExemplaireService.create(new Exemplaire(true,carte1,Etat.Abimee,c1));
			ExemplaireService.create(new Exemplaire(true,carte2,Etat.BonEtat,c2));
		}

	
}
