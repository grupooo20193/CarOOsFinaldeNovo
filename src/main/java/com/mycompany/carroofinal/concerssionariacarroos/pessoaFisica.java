/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.concerssionariacarroos;

/**
 *
 * @author walki
 */
public class pessoaFisica extends Cliente{
    private String nome;
    private String cpf;

    public pessoaFisica(String nome, String cpf, String telefoneCliente,String celularCliente, String enderecoCliente, String estadoCliente, String cepCliente, String cidadeCliente) {
        super(nome, telefoneCliente, celularCliente, enderecoCliente, estadoCliente, cepCliente, cidadeCliente, cpf);
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getIdentificacaoCliente() {
        return nome;
    }

    @Override
    public void setIdentificacaoCliente(String identificacaoCliente) {
        this.nome = identificacaoCliente;
    }

    @Override
    public String getDocumentoCliente() {
        return cpf;
    }

    @Override
    public void setDocumentoCliente(String documentoCliente) {
        this.cpf = documentoCliente;
    }
    
    @Override
    public boolean verificaDocumento(String CPF){
        
       if (cpf.equals("00000000000") || cpf.equals("11111111111") ||            
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") || 
           (cpf.length() != 14)) 
        {
            return false;
        } 
            return true;
    }
    
    @Override
    public boolean verificaIdentificacao(String nome){
        if(nome.isEmpty()){
            return false;
        }
        boolean ok = false;
        
        for (int i=0; i<nome.length();i++){

            if (Character.isAlphabetic((nome.charAt(i)))) { 
                ok = true;
            }
            else if (nome.charAt(i)!= ' '){
                ok = false;
                i = nome.length();
            }
 
        }
        
        return ok;
        }
    
    
}
