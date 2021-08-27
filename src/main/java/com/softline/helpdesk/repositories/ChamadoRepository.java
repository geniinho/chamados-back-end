package com.softline.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softline.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
