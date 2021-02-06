package com.mitocode.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.repo.IPersonaRepo;
import com.mitocode.repo.PersonaRepoImpl;

@RestController
public class PersonaController {

	//private List<String> lista = new ArrayList<>();

	/**
	 *La anotación Autowired me implementa el singleton y no hay necesidad de hacerle new al objeto q necesito
	 *Tambien sirve para implementar a nivel de spring el constructor del obejto q quiero instanciar
	 *en este caso IPersonaRepo. Con esta etiqueta spring sabe q necesito una instancia y la genera implementando singleton 
	 */
	@Autowired
	private IPersonaRepo repo;// = new PersonaRepoImpl();
	
	@GetMapping
	public void saludar() {
		repo.saludar();
	}
	
}
