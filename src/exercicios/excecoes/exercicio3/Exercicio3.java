package exercicios.excecoes.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Sua idade é de: " + idade + " anos");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas numeros inteiros.");
        }
    }
}
