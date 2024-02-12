package com.bancodigital.api.banco.digital.service;

import com.bancodigital.api.banco.digital.model.Cliente;
import com.bancodigital.api.banco.digital.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
}
