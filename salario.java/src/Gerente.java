public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salariobase, double bonus) {
        super(nome, salariobase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override

    public double Funcionariocalcularsalario() {
        return getsalariobase() + bonus;
    }
}
