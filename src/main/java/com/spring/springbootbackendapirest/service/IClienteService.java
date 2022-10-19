package com.spring.springbootbackendapirest.service;

import com.spring.springbootbackendapirest.models.Cliente;

import java.util.List;

public interface IClienteService {

    public Cliente save(Cliente cliente);

    public List<Cliente> findAll();

    public void delete(Long id);

    public Cliente findById(Long id);

}
