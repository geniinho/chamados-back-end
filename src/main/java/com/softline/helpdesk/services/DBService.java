package com.softline.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softline.helpdesk.domain.Chamado;
import com.softline.helpdesk.domain.Cliente;
import com.softline.helpdesk.domain.Tecnico;
import com.softline.helpdesk.domain.enums.Perfil;
import com.softline.helpdesk.domain.enums.Prioridade;
import com.softline.helpdesk.domain.enums.Status;
import com.softline.helpdesk.repositories.ChamadoRepository;
import com.softline.helpdesk.repositories.ClienteRepository;
import com.softline.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico (null, "softline","81662267746","softline@email.com","123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Trovalds","81843488949", "cliente@email.com", "123");
		
		Chamado c1 = new Chamado(null, null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
