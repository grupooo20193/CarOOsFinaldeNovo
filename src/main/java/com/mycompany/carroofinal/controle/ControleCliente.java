/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.controle;

import com.mycompany.carroofinal.concerssionariacarroos.Cliente;
import com.mycompany.carroofinal.concerssionariacarroos.pessoaFisica;
import com.mycompany.carroofinal.concerssionariacarroos.pessoaJuridica;

/**
 *
 * @author walki
 */
public class ControleCliente {
    private String identificacaoCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String enderecoCliente;
    private String estadoCliente;
    private String cidadeCliente;
    private String cepCliente;
    private String documentoCliente;
    private int opcao;
    private Cliente cliente;
        

    public ControleCliente(String identificacaoCliente, String telefoneCliente, String celularCliente, String enderecoCliente, String estadoCliente, 
            String cidadeCliente, String cepCliente, String documentoCliente, int opcao) {
        this.identificacaoCliente = identificacaoCliente;
        this.telefoneCliente = telefoneCliente;
        this.celularCliente = celularCliente;
        this.enderecoCliente = enderecoCliente;
        this.estadoCliente = estadoCliente;
        this.cidadeCliente = cidadeCliente;
        this.cepCliente = cepCliente;
        this.documentoCliente = documentoCliente;
        this.opcao = opcao;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getIdentificacaoCliente() {
        return identificacaoCliente;
    }

    public void setIdentificacaoCliente(String identificacaoCliente) {
        this.identificacaoCliente = identificacaoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Cliente getCliente() {
        if(this.opcao == 1){
            this.cliente = new pessoaFisica(identificacaoCliente, telefoneCliente, celularCliente, enderecoCliente, estadoCliente, cepCliente, cidadeCliente, documentoCliente);
        
           
        }
        else
            this.cliente = new pessoaJuridica(identificacaoCliente, documentoCliente, telefoneCliente, celularCliente, enderecoCliente, estadoCliente,cepCliente, cidadeCliente);
       
        return cliente;
    }

    
    public boolean verificaInfo(){
        getCliente();
        boolean b = true;
        
        
        b = cliente.verificaCep(this.cepCliente);
        if(b == false){
            return b;
        }
        b = cliente.verificaCidade(this.cidadeCliente);
        if(b == false){
            return b;
        }
        b = cliente.verificaDocumento(this.documentoCliente);
        if(b == false){
            return b;
        }
        b = cliente.verificaEndereco(this.enderecoCliente);
        if(b == false){
            return b;
        }
        b = cliente.verificaIdentificacao(this.identificacaoCliente);
        if(b == false){
            return b;
        }
        return b;
       
        
    }
    
}
