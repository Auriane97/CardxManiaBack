package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cardxMania.config.AppConfig;




public class SpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getBeanFactory().createBean(Test.class).run(args);
		ctx.close();
		

	}

}
