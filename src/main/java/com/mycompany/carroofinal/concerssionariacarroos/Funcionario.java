
package com.mycompany.carroofinal.concerssionariacarroos;


public class Funcionario {
     
    private String idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private String senhaFuncionario;
   
    public Funcionario(String id, String nome, String usuario, String senha){
        this.idFuncionario = id;
        this.nomeFuncionario = nome;
        this.cargoFuncionario = usuario;
        this.senhaFuncionario = senha;
    }

    public Funcionario() {
    }
   
    public String getIdFuncionario() {
        return idFuncionario;
    }
    
   
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
   
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getUsuarioFuncionario() {
        return cargoFuncionario;
    }

    public void setUsuarioFuncionario(String usuarioFuncionario) {
        this.cargoFuncionario = usuarioFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    
    
    
   
     
}
