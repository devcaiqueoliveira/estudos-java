package projeto3.veiculo;

import projeto3.interfaces.Tarifavel;

public class Carro extends Veiculo implements Tarifavel {
    private int capacidadePortamalas;

    public Carro(String placa, String modelo, int capacidadePortamalas) {
        super(placa, modelo);
        this.capacidadePortamalas = capacidadePortamalas;
    }

    @Override
    public void exibirDados() {
        System.out.println("[Carro] Placa: " + placa + " | Modelo: " + modelo + " | Capacidade Porta-malas: " + capacidadePortamalas + "L");
    }

    @Override
    public double calcularValor(long minutos) {
        return minutos * 0.20;
    }
}