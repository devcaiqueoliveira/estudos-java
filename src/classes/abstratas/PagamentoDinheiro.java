package classes.abstratas;

public class PagamentoDinheiro extends Pagamento{
    @Override
    public void processar() {
        System.out.println("Validando troco...");
    }
}
