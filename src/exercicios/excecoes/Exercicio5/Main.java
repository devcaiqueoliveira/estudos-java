package exercicios.excecoes.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

            try {
                conta.saque(200.00);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro no saque: " + e.getMessage());
            }

    }
}