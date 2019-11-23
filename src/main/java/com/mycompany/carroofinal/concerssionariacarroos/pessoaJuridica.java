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
public class pessoaJuridica extends Cliente{
    private String razaoSocial;
    private String cnpj;

    public pessoaJuridica(String razaoSocial, String cnpj, String telefoneCliente, String celularCliente, String enderecoCliente, String estadoCliente, String cepCliente, String cidadeCliente) {
        super(razaoSocial, telefoneCliente,celularCliente, enderecoCliente, estadoCliente, cepCliente, cidadeCliente, cnpj);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    

    
    @Override
    public String getIdentificacaoCliente() {
        return razaoSocial;
    }

    @Override
    public void setIdentificacaoCliente(String identificacaoCliente) {
        this.razaoSocial = identificacaoCliente;
    }

    @Override
    public String getDocumentoCliente() {
        return cnpj;
    }

    @Override
    public void setDocumentoCliente(String documentoCliente) {
        this.cnpj = documentoCliente;
    }
    
    @Override
    public boolean verificaDocumento(String CNPJ){
        
       if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") ||            
            cnpj.equals("22222222222222") || cnpj.equals("33333333333333") ||
            cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
            cnpj.equals("66666666666666") || cnpj.equals("77777777777777") ||
            cnpj.equals("88888888888888") || cnpj.equals("99999999999999") || 
           (cnpj.length() != 18)) 
        {
            return false;
        } 
            return true;
    }
    
    @Override
    public boolean verificaIdentificacao(String RazaoSocial){
        if(razaoSocial.isEmpty())
            return false;
        else
            return true;
    }
}
