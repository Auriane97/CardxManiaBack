package test;

import java.time.LocalDate;

import javax.transaction.Transactional;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cardxMania.config.AppConfig;
import cardxMania.model.Lot;
import cardxMania.model.User;
import cardxMania.service.CompteService;
import cardxMania.service.LotService;
import cardxMania.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@Transactional
public class LotServiceTest {
	
	@Autowired
	private LotService lotService;
	@Autowired
	private CompteService compteService;
	@Autowired 
	private UserService userService;
	
	
	
	@Test
	//@Commit
	public void lotCreation() {
		lotService.create(new Lot((User)compteService.getById(1),(User)compteService.getById(3),LocalDate.now()));

	}
}
