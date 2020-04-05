package br.com.dksweb.speedFood;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dksweb.speedFood.domain.Categoria;
import br.com.dksweb.speedFood.repositories.CategoriaRepository;

@SpringBootApplication
public class SpeedFoodApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpeedFoodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repository.saveAll(Arrays.asList(cat1, cat2));
	}

}
