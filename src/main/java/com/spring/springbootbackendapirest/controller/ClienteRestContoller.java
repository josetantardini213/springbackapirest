package com.spring.springbootbackendapirest.controller;

import com.spring.springbootbackendapirest.models.Cliente;
import com.spring.springbootbackendapirest.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestContoller {
@Autowired
private IClienteService clienteService;

@GetMapping("/clientes")
public List<Cliente> index(){
return clienteService.findAll();
}

@GetMapping("/clientes/{id}")
public Cliente show(@PathVariable Long id){
return clienteService.findById(id);
}

@PostMapping("/clientes")
public Cliente create(@RequestBody Cliente cliente){
    cliente.setCreateAt(new java.util.Date());
return clienteService.save(cliente);
}


}
