package Questao01CadastroDeMidias;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo(){
        return "Tipo - "+getClass().getSimpleName();
    }

    public String getDetalhes(){
        return "Detalhes= Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados(){
        System.out.println(getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir dados para: "+getTipo());
        System.out.println("Codigo: ");
        setCodigo(scanner.nextInt());
        System.out.println("Preco: ");
        setPreco(scanner.nextDouble());

        scanner.nextLine(); // limpar buffer do teclado

        System.out.println("Nome: ");
        setNome(scanner.nextLine());
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

}

