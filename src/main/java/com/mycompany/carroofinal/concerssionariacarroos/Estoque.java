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
public class Estoque {
    
    private ArrayList<Carro> estoque;
    
    public Estoque(){
        estoque = new ArrayList<>();
        carrosTest();
    }
    
    public void carrosTest(){
        estoque.add(new Carro("Chevrolet", "Bolt", "2020", 51070));
        estoque.add(new Carro("Chevrolet", "Camaro", "2020", 98067));
        estoque.add(new Carro("Fiat", "Cronos", "2018", 36089));
        estoque.add(new Carro("Fiat", "Doblô", "2017", 30533));
        estoque.add(new Carro("Ford", "Eco Sport", "2017", 46005));
        estoque.add(new Carro("Ford", "Fiesta", "2018", 43738));
        estoque.add(new Carro("VolksWagen", "Gol", "2019", 29500));
        estoque.add(new Carro("VolksWagen", "Golf", "2020", 60200));    
    }

    /**
     * @return the estoque
     */
    public ArrayList<Carro> getEstoque() {
        return estoque;
    }

   
    public ArrayList<Carro> busca(String info, int opcao){
        System.out.println("foi no estoque "+info+opcao);
        ArrayList<Carro> encontrados = new ArrayList<>();
        //1:marca, 3: ano.
        switch(opcao){
            case 1:
                buscaPorMarca(info,encontrados);
                break;
            case 3:
                buscaPorAno(info, encontrados);
                break;
        }
        return encontrados;
    }
    
    public void buscaPorMarca(String info, ArrayList<Carro> encontrados){
        System.out.println("chegou na busca"+estoque.size()+info);
        for(int i = 0; i < estoque.size(); i++)
        {
            if(((estoque.get(i).getMarcaCarro()).compareTo(info)) == 0){
                encontrados.add(estoque.get(i));
                System.out.println(estoque.get(i).getMarcaCarro());
            }
        }
    }
    
//    public void buscaPorModelo(String info, ArrayList<Carro> encontrados){
//        for(int i = 0; i < estoque.size(); i++)
//        {
//            if(estoque.get(i).getModeloCarro().compareTo(info) == 0){
//                encontrados.add(estoque.get(i));
//            }
//        }
//    }
    
    public void buscaPorAno(String info, ArrayList<Carro> encontrados){
        for(int i = 0; i < estoque.size(); i++)
        {
            if(estoque.get(i).getAnoCarro().compareTo(info) == 0){
                encontrados.add(estoque.get(i));
            }
        }
    }
}
