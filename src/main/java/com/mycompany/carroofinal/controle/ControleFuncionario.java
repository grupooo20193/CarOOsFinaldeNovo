/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.controle;

import com.mycompany.carroofinal.concerssionariacarroos.BancoDeDadosFuncionario;
import com.mycompany.carroofinal.concerssionariacarroos.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author walki
 */
public class ControleFuncionario {
    
    private String nome;
    private String cargo;
    private String cpf;
    private String senha;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    BancoDeDadosFuncionario b;
    
    Funcionario funcionario;
    
    public ControleFuncionario(){
        //temporario
        criaFuncionarios();
    }
    
    public ControleFuncionario(String nome, String cargo, String cpf, String senha){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.senha = senha;
        //temporario escluir depois
        Funcionario nf = new Funcionario("01546897847", nome, cargo, senha);
        this.funcionarios.add(nf);
        
        
    }
    
    //temporario
    public void criaFuncionarios(){
        Funcionario nfu1 = new Funcionario("01546897847", "Nome do 1", cargo, senha);
        funcionarios.add(nfu1);
        Funcionario nfu2 = new Funcionario("01546897847", "Nome do 2", cargo, senha);
        funcionarios.add(nfu2);
        Funcionario nfu3 = new Funcionario("01546897847", "Nome do 3", cargo, senha);
        funcionarios.add(nfu3);
        
    }
    
    //mudar para setar e puxar do banco de dados
    
    public ArrayList<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }
    
    public void setFuncinarios(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
   
    /* Utilizada no lugar de criaFUncionarios
    public void criaFuncionario(){
        if(verificaInfo()==true){
        funcionario = new Funcionario(cpf, nome, cargo, senha);
        b.adicionaFuncionario(funcionario);
        }
        else
            JOptionPane.showMessageDialog(null, "Erro");
    }
    */
   
    public boolean verificaInfo(){
        if (nome.isEmpty()){
            return false;
        }
        if (cpf.isEmpty()){
            return false;
        }
        if (senha.isEmpty()){
            return false;
        }
        return true;
    }

    public void removeFuncionario(Funcionario funcionario) {
        b.deletaVendedor(funcionario);
    }
 
    
}
