
package com.mycompany.carroofinal.concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Vendedor extends Funcionario {
    
    private ArrayList<Venda> vendas;
    private ArrayList<Cliente>clientes;

    public Vendedor(String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
    }

    public Vendedor(ArrayList<Venda> vendas, ArrayList<Cliente> clientes, String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
        this.vendas = vendas;
        this.clientes = clientes;
    }

   

    

     /* public void retornaFuncionarios(){
        for(int i=0; i < bancoDeDadosFuncionario.quantidadeVendedores(); i++){
            System.out.println(bancoDeDadosFuncionario.getVendedores(i).getNomeFuncionario());
            System.out.println("");
        }
    }*/  
}
