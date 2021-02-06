package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Paciente;

//@Repository//No hay necesidad de estereotiparlo porq extiende ya del repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

}
