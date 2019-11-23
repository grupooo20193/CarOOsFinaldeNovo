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
public class ModelosCarros {
    private ArrayList<Carro> carros;
    
    private ArrayList<String>volkswagen;
    private ArrayList<String>ford; 
    private ArrayList<String>chevrolet;
    private ArrayList<String>fiat;

    public ModelosCarros() {
        carros = new ArrayList<>();
        volkswagen = new ArrayList<>();
        ford = new ArrayList<>();
        chevrolet = new ArrayList<>();
        fiat = new ArrayList<>();
    }

    public ArrayList<String> getModelo(String modelo){
        switch(modelo){
            case"Volkswagen":
                getVolkswagenModelo();
                return this.volkswagen;
                
            
            case"Chevrolet":
                getVolkswagenModelo();
                return this.volkswagen;
                
                
            case"Ford":
                getVolkswagenModelo();
                return this.volkswagen;
              
            
            case"Fiat":
                getVolkswagenModelo();
                return this.volkswagen;
                
        }
        return  null;
    }
    
    public void getVolkswagenModelo(){
        this.volkswagen.add("Fox");
        this.volkswagen.add("Gol");
        this.volkswagen.add("Golf");
        this.volkswagen.add("Jetta");
        this.volkswagen.add("Passat");
        this.volkswagen.add("Polo");
        this.volkswagen.add("Space Fox");
        this.volkswagen.add("T-Cros");
        this.volkswagen.add("up!");
        this.volkswagen.add("Virtus");
        this.volkswagen.add("Voyage");
        this.volkswagen.add("Tiguan Allspace");
        
        
    }
    
    public void getFordModelos(){
        this.ford.add("Ecosport");
        this.ford.add("Edge");
        this.ford.add("Fiesta");
        this.ford.add("Fusion");
        this.ford.add("KA");
        this.ford.add("Mustang");
        
    }
    
    public void getChevroletModelos(){
        this.chevrolet.add("Bolt");
        this.chevrolet.add("Camaro");
        this.chevrolet.add("Cobalt");
        this.chevrolet.add("Cruze");
        this.chevrolet.add("Celta");
        this.chevrolet.add("Onix");
        this.chevrolet.add("Onix Plus");
        this.chevrolet.add("Prisma");
        this.chevrolet.add("Spin");
    }
    
    public void getFiatModelos(){
        this.fiat.add("Cronos");
        this.fiat.add("Doblô");
        this.fiat.add("Argos");
        this.fiat.add("Mobi");
        this.fiat.add("Grand Siena");
        this.fiat.add("Uno");
        this.fiat.add("Weekend");
       
    }
    
    
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
