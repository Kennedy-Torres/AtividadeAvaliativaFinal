package Questao02CadastroDeVeiculos;

import java.util.Scanner;

public abstract class Veiculos {
    private String modelo;
    private double preco;


    public Veiculos(String nome, double preco){
        this.modelo = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public abstract void printDados(); // será abstrato pois não pretendemos instânciar a classe veiculos, mas sim a classe moto e carro


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
