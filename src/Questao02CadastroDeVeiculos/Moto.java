package Questao02CadastroDeVeiculos;

import java.util.Scanner;

public class Moto extends Veiculos{
    private int ano;


    public Moto(String nome,double preco,int ano){
        super(nome,preco);
        this.ano = ano;
    }

//    @Override
//    public double getPreco() {
//        return super.getPreco();
//    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public void insertData() {
        Scanner scanner = new Scanner(System.in); // classe veiculos nao possui metodo insertData, logo, não podemos fazer polimorfismo com ela

        System.out.print("Nome/Modelo: ");
        setModelo(scanner.nextLine());
        System.out.println("Preco: ");
//        setPreco(scanner.nextDouble());
        this.setPreco(scanner.nextDouble());
        System.out.println("Ano: ");
        setAno(scanner.nextInt());
    }

    @Override
    public void printDados() {
        System.out.print(getClass().getSimpleName()+" - Nome/Modelo: "+getModelo()+", Preco: "+getPreco()+", Ano:"+getAno()+"");
    }

    public int getAno() {
        return ano;
    }


}
