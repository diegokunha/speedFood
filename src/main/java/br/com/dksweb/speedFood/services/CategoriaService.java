package br.com.dksweb.speedFood.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dksweb.speedFood.domain.Categoria;
import br.com.dksweb.speedFood.repositories.CategoriaRepository;
import br.com.dksweb.speedFood.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	/*
	 * Lista as Categorias por ID 
	 * */
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
