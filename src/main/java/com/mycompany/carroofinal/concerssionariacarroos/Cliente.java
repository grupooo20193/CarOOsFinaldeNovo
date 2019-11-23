package com.mycompany.carroofinal.concerssionariacarroos;

public abstract class Cliente {
 
    private String identificacaoCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String enderecoCliente;
    private String estadoCliente;
    private String cidadeCliente;
    private String cepCliente;
    private String documentoCliente;

    
    public Cliente(){}
    
    public  Cliente(String identificacaoCliente, String telefoneCliente,String celularCliente, String enderecoCliente, String estadoCliente, String cepCliente, String cidadeCliente, String documentoCliente){
        this.identificacaoCliente = identificacaoCliente;
        this.telefoneCliente = telefoneCliente;
        this.celularCliente = celularCliente;
        this.enderecoCliente = enderecoCliente;
        this.estadoCliente = estadoCliente;
        this.cepCliente = cepCliente;
        this.cidadeCliente = cidadeCliente;
        this.documentoCliente = documentoCliente;
    }

    public boolean verificaEndereco(String endereco){
        if(endereco.isEmpty())
            return false;
        else
            return true;
    }
    public boolean verificaCep(String cep){
        if(cep.isEmpty())
            return false;
        else
            return true;
    }
    public boolean verificaCidade(String cidade){
        if(cidade.isEmpty())
            return false;
        else
            return true;
    }
    
    public abstract boolean verificaIdentificacao(String identificacao);
    
    public abstract boolean verificaDocumento(String documento);
    
    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public abstract String getIdentificacaoCliente(); 

    public abstract void setIdentificacaoCliente(String identificacaoCliente); 

    public abstract String getDocumentoCliente();
            
    public abstract void setDocumentoCliente(String documentoCliente);

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
    
    
}


