package projeto1;

public class Funcionario {
    private int id;
    private String name;
    private double salarioBase;

    public Funcionario(int id, String name, double salarioBase) {
        this.id = id;
        this.name = name;
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void printDetalhesFuncionario() {
        System.out.println("Nome: " + name + " ( ID: " + getId() + " )" + ", Salário Base: R$ " + salarioBase);
    }

    public void printSalarioTotal() {
        System.out.println("Salário Total de " + getName() + ": R$ " + calcularSalario());
    }

    public void printStatus() {
        if (calcularSalario() < 5000) {
            System.out.println("Status: Salário padrão.");
        } else {
            System.out.println("Status: Salário Diretoria");
        }
    }
}
