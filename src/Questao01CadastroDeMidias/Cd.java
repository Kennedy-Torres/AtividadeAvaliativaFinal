package Questao01CadastroDeMidias;

import Questao01CadastroDeMidias.Midia;

import java.util.Scanner;

public class Cd extends Midia {
    private int nMusicas;

    public Cd(){}

    public Cd(int codigo, int preco, String nome, int nMusicas){
        super(codigo,preco,nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +", Número de Musicas: "+ getMusicas();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de Músicas: ");
        setMusicas(scanner.nextInt());
    }

    public int getMusicas() {
        return nMusicas;
    }

    public void setMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}
