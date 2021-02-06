package com.mitocode.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Paciente;
import com.mitocode.repo.IPacienteRepo;

//Capa de logica de negocio, no es REST
@Service
public class PacienteServiceImp implements IPacienteService {

	@Autowired
	private IPacienteRepo repo;
	
	@Override
	public Paciente registrar(Paciente p) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Paciente modificar(Paciente p) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Paciente> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Paciente listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Paciente> op = repo.findById(id);//La clase optional permite controller nullPointerException
		return op.isPresent() ? op.get() : new Paciente();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);		
	}

}
