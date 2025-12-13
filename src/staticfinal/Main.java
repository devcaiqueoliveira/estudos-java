package staticfinal;

public class Main {

    public static void main(String[] args) {

        LancadorDeTextos lancadorDeTextos = new LancadorDeTextos(10);

        System.out.println(lancadorDeTextos.getTipo());

        LancadorDeTextos.exibirDetalhesFuncionario();

    }
}
