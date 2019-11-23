/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.controle;

import com.mycompany.carroofinal.concerssionariacarroos.Carro;
import com.mycompany.carroofinal.concerssionariacarroos.Estoque;
import com.mycompany.carroofinal.concerssionariacarroos.ModelosCarros;
import static java.lang.System.exit;
import java.util.ArrayList;

/**
 *
 * @author fabricioguidine
 */
public class ControleCarro {
    Carro c;
    private ArrayList<String> erros;
    String marcaCarro;
    String modeloCarro;
    String anoCarro;
    float valorCarro;
    ModelosCarros modeloscarros;
    private Estoque estoque = new Estoque();;
    
    public ControleCarro(){
        modeloscarros = new ModelosCarros();
        erros = new ArrayList<>();
        
        
    }
    public ControleCarro(String marcaCarro, String modeloCarro, String anoCarro, float valorCarro){
        this.c = new Carro();
        erros = new ArrayList<>();
        
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.valorCarro = valorCarro;
        
        
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    public float getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(float valorCarro) {
        this.valorCarro = valorCarro;
    }
    
    
    //este metodo retorna um arraylist de modelos para setar o combobox do campo modelo
    public ArrayList<String> getModelos(String marca){
        
        ArrayList<String> modelos;
        modelos = modeloscarros.getModelo(marca);
        return modelos;
    }
    
    public void novoCarro(){
        c.setMarcaCarro(marcaCarro);
        c.setModeloCarro(modeloCarro);
        c.setAnoCarro(anoCarro);
        c.setValorCarro(valorCarro);
        estoque.getEstoque().add(c);
        
        
        
    }
    
        
    /*public void verificaMarca(){
        if(marcaCarro.isEmpty() == true){
            getErros().add("Campo marca vazio.");
        }
        for(int i=0; i<marcaCarro.length(); i++){
            if((Character.isAlphabetic(marcaCarro.charAt(i))) == false && (marcaCarro.charAt(i) != ' ')){
                getErros().add("Marca inválido.");
                exit(0);
            }
        }
    }
    
    public void verificaModelo(){
        if(modeloCarro.isEmpty() == true){
            getErros().add("Campo modelo vazio.");
        }
        for(int i=0; i<modeloCarro.length(); i++){
            if((Character.isAlphabetic(modeloCarro.charAt(i))) == false && (modeloCarro.charAt(i) != ' ')){
                getErros().add("Modelo inválido.");
                exit(0);
            }
        }    
    }*/
    
    public void verificaAno(){
        if(anoCarro.isEmpty() == true){
            getErros().add("Campo ano vazio.");
        }
        
        int ano = Integer.parseInt(anoCarro);
        
        if(ano < 2010){
            getErros().add("Ano inválido, permitido a partir de 2010");
        }
    }
     
    public void verificaValor(float valor){
        if(valorCarro < 0){
            getErros().add("Valor inválido.");
        }
    }

    /**
     * @return the erros
     */
    public ArrayList<String> getErros() {
        return erros;
    }

    /**
     * @return the estoque
     */
    public Estoque getEstoque() {
        System.out.println("pegou estoque");
        return estoque;
    }
    
   
}
