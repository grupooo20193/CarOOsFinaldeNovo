package com.mycompany.carroofinal.concerssionariacarroos;



public class Gerente extends Funcionario {

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
  

    public Gerente(String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
    }

   

    
    
    public void retornaFuncionarios(){
        
       
    }
}
