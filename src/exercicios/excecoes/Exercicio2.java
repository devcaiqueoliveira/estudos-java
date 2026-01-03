package exercicios.excecoes;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bia", "Leo"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um indice para ver o nome: ");
            int indice = sc.nextInt();
            System.out.println("Nome: " + nomes[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Inidice invalido. Escolha um inidice menor." );
        }
    }
}
