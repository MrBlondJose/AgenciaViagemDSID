package com.dsid.viagem.demo.Models.HttpRequest;

import com.dsid.viagem.demo.Models.Entities.Cartao;
import com.dsid.viagem.demo.Models.Entities.Cliente;
import com.dsid.viagem.demo.Models.Entities.Endereco;
import com.dsid.viagem.demo.Models.Entities.TelefoneCliente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
@Getter
@Setter
public class ClienteRequest {

    private String email;

    private String nome;

    private Date dataNascimento;

    private String nomeMae;

    private String cpf;


    private String senha;


    private List<TelefoneCliente> telefonesCliente;



    private List<Cartao> cartoesCliente;



    private List<Endereco> enderecosCliente;


}
