package com.softline.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softline.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
