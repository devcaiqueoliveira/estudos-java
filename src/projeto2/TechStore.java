package projeto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> carrinho = new ArrayList<>();

        boolean rodando = true;

        while (rodando) {
            System.out.println("---- CAIXA TECHSTORE (Livre) ----");
            System.out.println("1. Adicionar Eletrônico");
            System.out.println("2. Adicionar Smartphone");
            System.out.println("3. Conferir Carrinho");
            System.out.println("4. Finalizar Pedido");
            System.out.println("0. Sair do sistema");
            System.out.print("> Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner, carrinho, 1);
                    break;
                case 2:
                    adicionarProduto(scanner, carrinho, 2);
                    break;
                case 3:
                    listarCarrinho(carrinho);
                    break;
                case 4:
                    finalizarPedido(carrinho);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção invalido.");
            }

        }
    }

    private static void adicionarProduto(Scanner scanner, List<Produto> carrinho, int tipo) {
        if (carrinho.size() > 10) {
            System.out.println("ERRO: Carrinho cheio! Finalize a compra.");
            return;
        }

        try {
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto novoProduto = null;

            if (tipo == 1) {
                System.out.println("Tensão (110v/220v): ");
                String tensao = scanner.nextLine();
                novoProduto = new Eletronico(nome, preco, tensao);
            } else if (tipo == 2) {
                System.out.println("Modelo/IMEI: ");
                String imei = scanner.nextLine();
                novoProduto = new Smartphone(nome, preco, imei);
            }

            carrinho.add(novoProduto);
            System.out.println("Ótimo, produto adicionado ao carrinho.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados. Tente novamente.");
            scanner.nextLine();
        }
    }

    private static void listarCarrinho(List<Produto> carrinho) {
        System.out.println("---- ITENS NA CESTA (" + carrinho.size() + "/10) ----");
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((i + 1) + ". " + carrinho.get(i).toString());
        }

        System.out.println("--------------------");

    }

    private static void finalizarPedido(List<Produto> carrinho) {
        if (carrinho.isEmpty()) {
            System.out.println("Não possivel finalizar um carrinho vazio.");
            return;
        }

        System.out.println("---- CUPOM FISCAL ----");

        double total = 0;

        for (Produto p : carrinho) {
            System.out.printf("Item: %-20s ... R$ %.2f\n", p.getName(), p.getPrice());
            total += + p.getPrice();
        }

        System.out.println("--------------------");
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", total);
        System.out.println("--------------------");
        System.out.println("Obrigado, volte sempre");
    }
}
