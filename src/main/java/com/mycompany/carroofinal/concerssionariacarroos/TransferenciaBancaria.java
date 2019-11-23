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
public class TransferenciaBancaria extends Pagamento implements AVista{

    @Override
    public float CalcularValor() {
         this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() - (0.03*this.getVenda().getCarro().getValorCarro())));
        
        return this.getVenda().getCarro().getValorCarro();
    }
    
}
