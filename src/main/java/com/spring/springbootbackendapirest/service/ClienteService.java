package com.spring.springbootbackendapirest.service;

import com.spring.springbootbackendapirest.dao.IClienteDao;
import com.spring.springbootbackendapirest.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }


    @Override
    @Transactional
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

    @Override
    @Transactional
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }
}
