package pierpaolo.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pierpaolo.u5w1d1.entities.Bevanda;
import pierpaolo.u5w1d1.entities.Menu;
import pierpaolo.u5w1d1.entities.Pizza;
import pierpaolo.u5w1d1.entities.Topping;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5w1d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);

		Menu m = (Menu) ctx.getBean("menu");
		m.printMenu();



		ctx.close();
	}

}
