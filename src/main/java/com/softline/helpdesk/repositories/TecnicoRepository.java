package com.softline.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.softline.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
