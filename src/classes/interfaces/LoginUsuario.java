package classes.interfaces;

import classes.abstratas.Pagamento;

public class LoginUsuario extends Pagamento implements Auditavel, Verificavel{

    @Override
    public void gerarLog() {
        System.out.println("Log: Usuario entrou no sistema...");
    }

    @Override
    public void verificarSenha() {

    }

    @Override
    public void processar() {

    }

}