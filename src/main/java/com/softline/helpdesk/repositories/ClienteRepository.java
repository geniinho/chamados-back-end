package com.softline.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softline.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
