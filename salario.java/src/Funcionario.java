public class Funcionario {
    private String nome;
    private double salariobase;

    public Funcionario(String nome, double salariobase) {
        this.nome = nome;
        this.salariobase = salariobase;
    }

    public String getnome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getsalariobase() {
        return salariobase;
    }

    public void setsalariobase(double salariobase){
        this.salariobase = salariobase;
    }

    public double calcularsalario() {
        return salariobase;
    }

    public void exibirFuncionario() {
        System.out.println("Funcionario: " + this.nome);
        System.out.println("Salario Final: " + this.calcularsalario());
    }

}
    