package equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", "123", 18);
        Pessoa pessoa2 = new Pessoa("Ana", "123", 18);
        Pessoa pessoa3 = new Pessoa("Ana", "1234", 18);
//
//        if (pessoa1.equals(pessoa3)) {
//            System.out.println("Pessoa 1 e 3 são iguais.");
//        } else {
//            System.out.println("Pessoa 1 e 3 não são iguais.");
//        }

        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa3.hashCode());

    }

}
