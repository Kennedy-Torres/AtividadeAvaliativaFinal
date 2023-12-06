package Questao01CadastroDeMidias;

import Questao01CadastroDeMidias.Midia;

import java.util.Scanner;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd(){}

    public Dvd(int codigo, double preco, String nome, int nFaixas){
        super(codigo,preco,nome);
        this.nFaixas = nFaixas;
    };

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Numero de Faixas: "+ getFaixas();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de Faixas: ");
        setFaixas(scanner.nextInt());
    }


    public int setFaixas(int nFaixas){
        return this.nFaixas = nFaixas;
    }

    public int getFaixas() {
        return nFaixas;
    }
}
