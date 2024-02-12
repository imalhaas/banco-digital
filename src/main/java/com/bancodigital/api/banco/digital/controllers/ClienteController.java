package com.bancodigital.api.banco.digital.controllers;

import com.bancodigital.api.banco.digital.model.Cliente;
import com.bancodigital.api.banco.digital.repository.ClienteRepository;
import com.bancodigital.api.banco.digital.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    public List<Cliente> listar(){
        return clienteService.listar();
    }

}
