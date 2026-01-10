package classes.interfaces;

public class Tranferencia implements Auditavel{

    @Override
    public void gerarLog() {
        System.out.println("Log: Transferencia realizada com sucesso.");
    }
}
