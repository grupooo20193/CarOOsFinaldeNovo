/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.concerssionariacarroos;

/**
 *
 * @author walki
 */
public class Cartao extends Pagamento implements APrazo, AVista{

    @Override
    public float CalcularValor() {
        this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() - (0.05*this.getVenda().getCarro().getValorCarro())));
        
        return this.getVenda().getCarro().getValorCarro();
    }

    @Override
    public float quantidadeParcelas() {
        return getParcelas();
    }

    @Override
    public float CalcularValor(int parcelas) {
        if(parcelas <= 12)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.1*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 12 && parcelas <= 24)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.15*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 24  && parcelas <= 36)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.2*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 36  && parcelas <= 48)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.25*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 48  && parcelas <= 60)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.3*this.getVenda().getCarro().getValorCarro())));
        
        else 
            System.out.println("Parcela indisponível!!");
        
        return this.getVenda().getCarro().getValorCarro();
    }

    

    
    
}
    
 /*       this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() - (0.05*this.getVenda().getCarro().getValorCarro())));
        
        return this.getVenda().getCarro().getValorCarro();
}
    if(parcelas <= 12)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.1*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 12 && parcelas <= 24)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.15*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 24  && parcelas <= 36)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.2*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 36  && parcelas <= 48)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.25*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 48  && parcelas <= 60)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.3*this.getVenda().getCarro().getValorCarro())));
        
        else 
            System.out.println("Parcela indisponível!!");
        
        return this.getVenda().getCarro().getValorCarro();
    }*/