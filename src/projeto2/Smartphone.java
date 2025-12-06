package projeto2;

public class Smartphone extends Produto{
    private String modeloImei;

    public Smartphone(String name, double price, String modeloImei) {
        super(name, price);
        this.modeloImei = modeloImei;
    }

    public String getModeloImei() {
        return modeloImei;
    }

    public void setModeloImei(String modeloImei) {
        this.modeloImei = modeloImei;
    }

    @Override
    public String getDetalhes() {
        return this.modeloImei;
    }
}
