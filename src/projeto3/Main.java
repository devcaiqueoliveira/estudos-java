package projeto3;

import projeto3.exceptions.DadosInvalidosException;
import projeto3.exceptions.EstacionamentoLotadoException;
import projeto3.exceptions.VeiculoNaoEncontradoException;
import projeto3.logic.Estacionamento;
import projeto3.veiculo.Carro;
import projeto3.veiculo.Moto;
import projeto3.veiculo.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(10);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("--- SISTEMA SMARTPARK ---");
            System.out.println("1. Entrada de Veículo");
            System.out.println("2. Saída de Veículo");
            System.out.println("3. Listar Vagas Ocupadas");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            try {
                switch (opcao) {
                    case 1:
                        System.out.println("Tipo (1-Carro, 2-Moto: ");
                        int tipo = Integer.parseInt(scanner.nextLine());
                        System.out.print("Placa: ");
                        String placa = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();

                        Veiculo novoVeiculo = null;

                        if (tipo == 1) {
                            System.out.println("Capacidade Porta-Malas (L): ");
                            int capicidadePortamalas = Integer.parseInt(scanner.nextLine());
                            novoVeiculo = new Carro(placa, modelo, capicidadePortamalas);
                        } else if (tipo == 2) {
                            System.out.println("Cilindradas: (cc)");
                            int cilindradas = Integer.parseInt(scanner.nextLine());
                            novoVeiculo = new Moto(placa, modelo, cilindradas);
                        } else {
                            System.out.println("Tipo inválido.");
                            continue;
                        }

                        estacionamento.entrada(novoVeiculo);
                        break;

                    case 2:
                        System.out.println("Digite a placa do veículo de saída: ");
                        String placaSaida = scanner.nextLine();
                        System.out.println("Tempo de permanência (minutos)");
                        long minutosPermanencia = Long.parseLong(scanner.nextLine());

                        double valor = estacionamento.saida(placaSaida, minutosPermanencia);
                        System.out.printf("Saída registrada! Valor a pagar: R$ %.2f%n", valor);
                        break;

                    case 3:
                        estacionamento.listarVagasOcupadas();
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            } catch (EstacionamentoLotadoException | VeiculoNaoEncontradoException | DadosInvalidosException e) {
                System.out.println("ERRO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
