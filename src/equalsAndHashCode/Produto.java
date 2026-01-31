package equalsAndHashCode;

import java.util.Objects;

public class Produto {

    private String name;
    private int price;
    private String category;

    public Produto(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return price == produto.price && Objects.equals(name, produto.name) && Objects.equals(category, produto.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }
}
