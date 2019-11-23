

package com.mycompany.carroofinal.concerssionariacarroos;

import java.io.File;
import java.util.ArrayList;

public class Carro {
    private int idCarro;
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
    private float valorCarro;
    
    public Carro(){
        
    }
    public Carro(String marcaCarro, String modeloCarro, String anoCarro, float valorCarro){
        this.anoCarro = anoCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.valorCarro = valorCarro;
    }

    Carro(int i, String ford, String fiesta, String string, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
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
    
     public ArrayList<String> getModelos(String marca){
        ModelosCarros modeloscarros = new ModelosCarros();;
        ArrayList<String> modelos;
        modelos = modeloscarros.getModelo(marca);
        return modelos;
    }
     
    /*public Estoque getEstoque() {
        Estoque estoque = new Estoque();
        return estoque;
    }*/
     
    public Estoque novoCarro(){
        Estoque estoque = new Estoque();
        Carro c = new Carro();
        c.setMarcaCarro(marcaCarro);
        c.setModeloCarro(modeloCarro);
        c.setAnoCarro(anoCarro);
        c.setValorCarro(valorCarro);
        
        return estoque;
        
        
    }
    
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
        ArrayList<String> erros = new ArrayList<>();
        return erros;
    }

    /**
     * @return the estoque
     */
    public Estoque getEstoque() {
        Estoque estoque = new Estoque();
        return estoque;
    }

}