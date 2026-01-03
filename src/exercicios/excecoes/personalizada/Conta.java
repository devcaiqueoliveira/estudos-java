package exercicios.excecoes.personalizada;

public class Conta {
    private double saldo = 100.0;

    public void saque(double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException("O saldo é insuficiente para este saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado! Saldo atual: " + saldo);
    }
}