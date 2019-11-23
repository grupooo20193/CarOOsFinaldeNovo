package com.mycompany.carroofinal.concerssionariacarroos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miche
 */
public class GsonExemplo {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1, "Ford", "Fiesta", "2019", 60000));
        carros.add(new Carro(2, "Fiat", "Uno", "2019", 30100));
        carros.add(new Carro(3, "Renault", "Clio", "2019", 33670));
        carros.add(new Carro(4,"Volkswagen", "Gol", "2018", 34890));
        carros.add(new Carro(5,"Chevrolet", "Classic", "2018", 34490));
        
        List<Cliente> clientes = new ArrayList<>();
        
        
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("0", "nomeFumcionario", "loginUsuario", "senhaFuncionario")); 
        
        
        
        File arquivo = new File("Concessionaria");
        if(!arquivo.isDirectory()){
            System.out.println("Criar diretorios");
            arquivo.mkdirs();
        }
        
        //Transformar em JSon
        Gson gson = new Gson();
        String toJson = gson.toJson(carros);
        System.out.println("toJson" +toJson);
        
       
        String toJson1 = gson.toJson(clientes);
        System.out.println("toJson" +toJson);
        
        String toJson2 = gson.toJson(funcionarios);
        System.out.println("toJson" +toJson);
        
        
        Type Carro = new TypeToken<List<Carro>>(){}.getType();
        List<Carro> fromJsonCarro = gson.fromJson(toJson, Carro);
        
        Type Cliente = new TypeToken<List<Cliente>>(){}.getType();
        List<Cliente> fromJsonCliente = gson.fromJson(toJson, Cliente);
        
        Type Funcionario = new TypeToken<List<Funcionario>>(){}.getType();
        List<Funcionario> fromJsonFuncionario = gson.fromJson(toJson, Funcionario);
        
        for(Carro carro : fromJsonCarro){
            System.out.println(carro);
        }
        
        for(Cliente cliente : fromJsonCliente){
            System.out.println(cliente);
        }
        
        for(Funcionario funcionario : fromJsonFuncionario){
            System.out.println(funcionario);
        }
    }

}
