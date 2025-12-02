package projeto1;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(int id, String name, double salarioBase, double bonus) {
        super(id, name, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * getBonus() / 100);
    }

    @Override
    public void printDetalhesFuncionario() {
        System.out.println("Nome: " + getName() + " (ID: " + getId() + " )" + ", Salário Base: R$ " + getSalarioBase() + ", Bônus: " + getBonus() + " %");
    }
}
