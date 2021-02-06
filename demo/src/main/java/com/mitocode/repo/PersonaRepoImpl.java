package com.mitocode.repo;

import org.springframework.stereotype.Repository;

//@Repository implica que la clase es un acceso a bd

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("TEST DI");
	}

}
