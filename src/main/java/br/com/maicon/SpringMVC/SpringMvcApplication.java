package br.com.maicon.SpringMVC;

import br.com.maicon.SpringMVC.model.People;
import br.com.maicon.SpringMVC.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {

	@Autowired
	private PeopleRepository peopleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		People peopleOne = new People(null, "Maicon Douglas Filipiaki", "mdfilipiaki@gmail.com");

		peopleRepository.save(peopleOne);
	}
}
