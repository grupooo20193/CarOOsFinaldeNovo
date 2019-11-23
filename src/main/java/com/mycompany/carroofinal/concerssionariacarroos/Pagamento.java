
package com.mycompany.carroofinal.concerssionariacarroos;

import java.util.Date;

public abstract class Pagamento {
    private int parcelas;
    
   
    private Venda venda;
    
    

    public int getParcelas() {
        return parcelas;
    }

    public void parcelas(int parcelas) {
        this.parcelas = parcelas;
    }

   
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Pagamento() {
    }

    public Pagamento(int parcelas, Venda venda) {
        this.parcelas = parcelas;
       
        this.venda = venda;
    }
    
    public abstract float CalcularValor();
    
}
    

   

