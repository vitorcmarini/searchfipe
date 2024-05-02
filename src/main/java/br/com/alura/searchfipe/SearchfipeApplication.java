package br.com.alura.searchfipe;

import br.com.alura.searchfipe.main.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchfipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SearchfipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
