package com.alejandrolopez.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandrolopez.model.Persona;
import com.alejandrolopez.repo.IPersonaRepo;
import com.alejandrolopez.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo persona;

	@Override
	public Persona registrar(Persona obj) {		
		return persona.save(obj);
	}

	@Override
	public Persona modificar(Persona obj) {		
		return persona.save(obj);
	}

	@Override
	public Persona leerPorId(Integer id) {
		return persona.findOne(id);
	}

	@Override
	public List<Persona> listar() {		
		return persona.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		persona.delete(id);
		
	} 
	
	

}
