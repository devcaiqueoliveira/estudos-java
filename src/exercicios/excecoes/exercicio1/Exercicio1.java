package exercicios.excecoes.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Numerador: ");
            int numerador = sc.nextInt();
            System.out.println("Denominador: ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é permitido dividir por zero.");
        }
    }
}
