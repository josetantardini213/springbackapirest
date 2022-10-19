package com.spring.springbootbackendapirest.dao;

import com.spring.springbootbackendapirest.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


}
