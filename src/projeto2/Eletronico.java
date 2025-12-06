package projeto2;

public class Eletronico extends Produto{
    private String tensao;

    public Eletronico(String name, double price, String tensao) {
        super(name, price);
        this.tensao = tensao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public String getDetalhes() {
        return this.tensao;
    }
}
