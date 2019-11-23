/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.concerssionariacarroos;

import java.util.ArrayList;

/**
 *
 * @author walki
 */
public class BancoDeDadosCarros {
    private ArrayList<Carro> carros = new ArrayList<>();
    
    public void adicionaCarro(Carro carro) {
        carros.add(carro);
    }

    public int quantidadeCarros() {
        return carros.size();
    }

    public void deletaCarro(Carro carro) {
        carros.remove(carro);
    }

    public Carro getCarro(int posicao) {
        return carros.get(posicao);
    }
}
