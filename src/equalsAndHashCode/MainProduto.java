package equalsAndHashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Leite Integral Parmalat", 10, "Laticinio");
        Produto produto5 = new Produto("Leite Integral Parmalat", 10, "Laticinio");
        Produto produto2 = new Produto("Coca Cola 2L", 15, "Bebidas");
        Produto produto3 = new Produto("Açucar", 3, "Alimentos");
        Produto produto4 = new Produto("Leite Desnatado CCGL", 8, "Laticinio");

//        System.out.println(produto1.hashCode());
//        System.out.println(produto2.hashCode());
//        System.out.println(produto3.hashCode());
//        System.out.println(produto4.hashCode());

        Map<Produto, String> map = new HashMap<>();

        Set<Produto> produtos = new HashSet<>();
        produtos.add(produto1);

        System.out.println(produto1.hashCode());
        System.out.println(produto5.hashCode());

        if (produtos.contains(produto5)) {
            System.out.println("Tem produto 5");
        } else {
            System.out.println("Nao tem produto");
        }

        Set<Vips> vipsSet = new HashSet<>();

        Vips efraim = new Vips("Efraim");
        Vips lahiri = new Vips("Lahiri");

        vipsSet.add(efraim);
        vipsSet.add(lahiri);

        if (vipsSet.contains(efraim)) {
            System.out.println("Adicionar permissao de frequentar a pista de dança");
        }
        if (vipsSet.contains(lahiri)) {
            System.out.println("Adicionar permissao de escolher musica");
        }

    }
}
