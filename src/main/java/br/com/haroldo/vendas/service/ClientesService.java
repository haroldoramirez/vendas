package br.com.haroldo.vendas.service;

import br.com.haroldo.vendas.model.Cliente;
import br.com.haroldo.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {


    @Autowired
    private ClientesRepository repository;


    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //aplicar validações
    }

}
