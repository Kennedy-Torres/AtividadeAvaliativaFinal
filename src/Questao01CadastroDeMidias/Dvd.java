package Questao01CadastroDeMidias;

import java.util.Scanner;

public class Dvd extends Midia {
    // NÃO FOI PRECISO inserir o método printDados na classe Dvd. utilizei da variável de referência mais genérica para a mais específica
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
