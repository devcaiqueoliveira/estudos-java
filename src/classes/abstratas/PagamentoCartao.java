package classes.abstratas;

public class PagamentoCartao extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Validando limite do cartão...");
    }
}
