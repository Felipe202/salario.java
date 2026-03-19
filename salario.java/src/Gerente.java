public class Gerente extends Funcionario {

    private double Bonus;

    public Gerente(String nome, double salariobase, double Bonus) {
        super(nome, salariobase);
        this.Bonus = Bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    @Override

    public double calcularsalario() {
     this.setsalariobase(getsalariobase() + Bonus);
     return this.getsalariobase();
    }
}
