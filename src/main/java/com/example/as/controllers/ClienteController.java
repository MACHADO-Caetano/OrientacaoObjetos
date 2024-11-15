package com.example.as.controllers;

import com.example.as.models.Cliente;
import com.example.as.repositories.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    final
    ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    List<Cliente> listaClientes(){
        return repository.findAll();
    }

    @PostMapping
    Cliente salvarCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
}
