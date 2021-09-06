package com.softline.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softline.helpdesk.domain.Chamado;
import com.softline.helpdesk.repositories.ChamadoRepository;
import com.softline.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! ID:" + id));
		
	}
	
}
