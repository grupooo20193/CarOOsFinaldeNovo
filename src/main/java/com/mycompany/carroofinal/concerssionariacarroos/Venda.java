package com.mycompany.carroofinal.concerssionariacarroos;


import com.mycompany.carroofinal.concerssionariacarroos.Cliente;
import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private String vendedor;
    private Carro carro;
    private ArrayList<String> pagamento;

    public Venda(Cliente cliente, String vendedor, Carro carro,ArrayList<String> pagamento) {

        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.pagamento = pagamento;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public ArrayList<String> getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList<String> pagamento) {
        this.pagamento = pagamento;
    }
   
}
