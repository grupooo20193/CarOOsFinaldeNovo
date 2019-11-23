/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carroofinal.controle;

import com.mycompany.carroofinal.concerssionariacarroos.Carro;
import com.mycompany.carroofinal.concerssionariacarroos.Cliente;
import com.mycompany.carroofinal.concerssionariacarroos.Pagamento;
import com.mycompany.carroofinal.concerssionariacarroos.Venda;
import com.mycompany.carroofinal.concerssionariacarroos.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author walki
 */
public class ControleVenda {
    
    private int idVendas;
    private Cliente cliente;
    private String vendedor;
    private Carro carro;
    private ArrayList<String> pagamento;
 
    public ControleVenda() {
    }
    
    
    public ControleVenda(Cliente cliente, String vendedor, Carro carro, ArrayList<String> pagamento) {
        
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.pagamento = pagamento;
        
        Venda venda = new Venda(cliente, vendedor, carro, pagamento);
    }
    
    
    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }


    
    
    
    
    
}
