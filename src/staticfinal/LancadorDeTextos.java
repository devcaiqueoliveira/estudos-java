package staticfinal;

public class LancadorDeTextos {

    public static String tipo = "Java";
    private final int CONSTANTE;


    public LancadorDeTextos(int CONSTANTE) {
        this.CONSTANTE = CONSTANTE;
    }

    public String getTipo() {
        return tipo;
    }

    public static void exibirDetalhesFuncionario() {
        System.out.println("Exibindo detalhes...");
    }

    public static void converteParaDolar() {
        System.out.println("Convertendo para dolar...");
    }

}
