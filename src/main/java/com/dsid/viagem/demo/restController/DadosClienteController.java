package com.dsid.viagem.demo.restController;

import com.dsid.viagem.demo.Models.Entities.Cliente;
import com.dsid.viagem.demo.Models.HttpRequest.CampoInvalidoException;
import com.dsid.viagem.demo.Models.HttpRequest.ClienteRequest;
import com.dsid.viagem.demo.repository.PersistenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DadosClienteController {

    @Autowired
    PersistenceRepository repository;



    @PostMapping(path= "/cadastro", consumes = "application/json", produces = "application/json")
    public String cadastraCliente(@RequestBody ClienteRequest clienteRequest) throws CampoInvalidoException {
            Cliente cliente= new Cliente.Builder(clienteRequest.getEmail()).
                    nome(clienteRequest.getNome()).
                    nomeMae(clienteRequest.getNomeMae()).
                    cpf(clienteRequest.getCpf()).
                    senha(clienteRequest.getSenha()).
                    dataNacimento(clienteRequest.getDataNascimento()).
                    telefonesCliente(clienteRequest.getTelefonesCliente()).
                    cartoesCliente(clienteRequest.getCartoesCliente()).
                    enderecosCliente(clienteRequest.getEnderecosCliente()).
                    build();
            if (repository.insertData(cliente)) {
               return new  String("Cliente cadastrado com sucesso");
            } else {
                return new String("Cadastro invalido. Cliente já cadastrado");
            }
    }

    @GetMapping("/teste")
    public String test(){
        return "";
    }
}
