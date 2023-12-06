package Questao01CadastroDeMidias;

import Questao01CadastroDeMidias.Dvd;
import Questao01CadastroDeMidias.Midia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Midia> list = new ArrayList<>(); // lista generica, para aceitar um upcasting

        System.out.println("Entre com a quantidade de Mídias: ");
        int qtdMidias = sc.nextInt();

        for (int i = 1; i <= qtdMidias; i++) {

            char op;
            do {
                System.out.print("Mídia #" + i + ":\nDVD ou CD (d/c)? ");
                op= sc.next().charAt(0); // pega o primeiro caracter da String
                if(op != 'd' && op!= 'c') {
                    System.out.println("Insira um valor valido!");
                    System.out.println();
                }
            }while (op != 'd' && op!= 'c');

            if (op == 'd') {
                // estou utilizando uma variável com tipagem mais genérica para referênciar o objeto mais específico
                Midia midia = new Dvd(); // Variável de referência do tipo Questao01CadastroDeMidias.Midia, mas referencia um objeto criado do tipo Questao01CadastroDeMidias.Dvd
//                Dvd midia = new Dvd(); // indifereça no resultado. Usa uma variável de referência do tipo Questao01CadastroDeMidias.Dvd que após cria um objeto do tipo Questao01CadastroDeMidias.Dvd será referênciado
                midia.inserirDados();
                list.add(midia);
            } else {
                Midia midia = new Cd();
//                Cd midia = new Cd();
                midia.inserirDados();
                list.add(midia);
            }
        }
        System.out.println();
        System.out.println("Mídias cadastradas(Cds e/ou Dvds):\n");

        for(int i=0;i<list.size();++i){
            Midia m = list.get(i);
            System.out.print("Midia #"+ (1 + i) +" ");
            m.printDados();
        }
    }
}
