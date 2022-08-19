package test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cardxMania.config.AppConfig;
import cardxMania.model.Exemplaire;
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
			ExemplaireService.create(new Exemplaire(true,c1,1,u1));
			ExemplaireService.create(new Exemplaire(true,c2,10,u2));
		}

	
}
