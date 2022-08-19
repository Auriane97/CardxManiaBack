package test;


import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cardxMania.config.AppConfig;
import cardxMania.model.User;
import cardxMania.service.CompteService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@Transactional
public class CompteServiceTest {

	
	@Autowired
	private CompteService compteService;
	
	@Test
	//@Commit
	public void test() {
		compteService.create(new User("login","mdp","mail@mail.fr"));
	}

}
