package exercicios.excecoes;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
            verificarSenha("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());;
        }
    }

    private static void verificarSenha(String senha) {
        if (senha.length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres");
        }
        System.out.println("Senha válida!");
    }
}