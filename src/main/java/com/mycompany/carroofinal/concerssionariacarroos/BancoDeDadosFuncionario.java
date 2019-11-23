
package com.mycompany.carroofinal.concerssionariacarroos;

import java.util.ArrayList;

public class BancoDeDadosFuncionario {
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void adicionaFuncionario(Funcionario e){
        funcionarios.add(e);
    }
    
    public int quantidadeVendedores(){
        return funcionarios.size();
    }

    public void deletaVendedor(Funcionario f){
        funcionarios.remove(f);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public Vendedor getVendedores(int posicao) {
        return (Vendedor) funcionarios.get(posicao);
    }
    
    
}
