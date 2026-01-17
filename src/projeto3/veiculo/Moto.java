package projeto3.veiculo;

import projeto3.interfaces.Tarifavel;

public class Moto extends Veiculo implements Tarifavel {
    private int cilindradas;

    public Moto(String placa, String modelo, int cilindradas) {
        super(placa, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.println("[Moto] Placa: " + placa + " | Modelo: " + modelo + " | Cilindradas: " + cilindradas + "cc");
    }

    @Override
    public double calcularValor(long minutos) {
        return minutos * 0.10;
    }
}
