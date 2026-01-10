package classes.abstratas;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setValor(100);
        pagamentoCartao.processar();
    }
}