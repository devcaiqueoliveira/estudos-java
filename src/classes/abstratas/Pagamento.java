package classes.abstratas;

public abstract class Pagamento {
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void processar();
}
