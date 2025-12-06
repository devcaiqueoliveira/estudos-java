package projeto2;

public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price) {
        if (price <= 0) {
            throw new RuntimeException("O preço do produto não pode ter valor zero ou negativo.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetalhes() {
        return "";
    }

    @Override
    public String toString() {
        String detalhe = getDetalhes().isEmpty() ? "" : " : Detalhe: " + getDetalhes();
        return String.format("%s | R$ %.2f%s", name, price, detalhe);
    }
}
