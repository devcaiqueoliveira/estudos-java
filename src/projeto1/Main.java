package projeto1;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario(1, "Alana", 1000);
        funcionarios[1] = new Gerente(2, "Marcos", 1000, 15);
        funcionarios[2] = new Funcionario(3, "Bruno", 1000);


        for (Funcionario funcionario : funcionarios) {
            funcionario.printDetalhesFuncionario();
            funcionario.printSalarioTotal();
            funcionario.printStatus();
            System.out.println("-----");
        }
    }
}
