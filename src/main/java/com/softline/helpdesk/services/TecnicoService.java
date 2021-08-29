package com.softline.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softline.helpdesk.domain.Tecnico;
import com.softline.helpdesk.repositories.TecnicoRepository;
import com.softline.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: "+ id));
	}
}
