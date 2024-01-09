package pierpaolo.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pierpaolo.u5w1d1.entities.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5w1d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);

		Menu m = (Menu) ctx.getBean("menu");
		m.printMenu();

		Tavolo tavolo1 = (Tavolo) ctx.getBean("tavolo_1");

		List<Prodotto> prodottiOrdinati = new ArrayList<>();
		prodottiOrdinati.add(ctx.getBean("vikinga", Pizza.class));
		prodottiOrdinati.add(ctx.getBean("coca",Bevanda.class));

		Ordine ordine1 = new Ordine(4, prodottiOrdinati, tavolo1);

		ctx.close();
	}

}
