/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.controle;

/**
 *
 * @author fabricioguidine
 */
public class ControleLogin {
    String usuario = "teste";
    String senha="123456";

    /**
     *
     */
    public ControleLogin(){}
    
    /**
     *
     * @param usuario
     * @param senha
     * @return
     */
    public boolean VerificaLogin(String usuario, String senha){
        if((usuario.compareTo(this.usuario) == 0) && (senha.compareTo(this.senha) == 0))
        {
            return true;            
        }
        else 
            return false;
    }
}
