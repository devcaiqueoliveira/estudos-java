package projeto3.logic;

import projeto3.exceptions.EstacionamentoLotadoException;
import projeto3.exceptions.VeiculoNaoEncontradoException;
import projeto3.interfaces.Tarifavel;
import projeto3.veiculo.Veiculo;


public class Estacionamento {
    private Veiculo[] vagas;

    public Estacionamento(int tamanho) {
        this.vagas = new Veiculo[tamanho];
    }

    public void entrada(Veiculo veiculo) throws EstacionamentoLotadoException{
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = veiculo;
                System.out.println("Veiculo estacionado na vaga: " + (i + 1));
                return;
            }
        }
        throw new EstacionamentoLotadoException("Não há vagas disponíveis no estacionamento.");
    }

    public double saida(String placa, long minutosPermanencia) throws VeiculoNaoEncontradoException {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i].getPlaca().equalsIgnoreCase(placa)) {
                double valorAPagar = ((Tarifavel) vagas[i]).calcularValor(minutosPermanencia);
                vagas[i] = null;
                return valorAPagar;
            }
        }
        throw new VeiculoNaoEncontradoException("Veiculo com placa: " + placa + " não encontrado.");
    }

    public void listarVagasOcupadas() {
        System.out.println("--- Relatório de Vagas Ocupadas ---");
        boolean vazio = true;

        for (int i = 0; i < vagas.length; i++) {
            if(vagas[i] != null) {
                System.out.println("Vaga [" + (i + 1) + "]: ");
                vagas[i].exibirDados();
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("O estacionamento está vazio.");
        }
    }
}
