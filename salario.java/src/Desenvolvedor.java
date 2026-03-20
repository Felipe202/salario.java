public class Desenvolvedor extends Funcionario {
    private double horaExtras;
    private double valorHorasExtra;

    public Desenvolvedor(String nome, double salariobase, double horaExtras, double valorHorasExtra) {
        super(nome, salariobase);
        this.horaExtras = horaExtras;
        this.valorHorasExtra = valorHorasExtra;
    }

    public double gethoraExtras(){
        return horaExtras;
    }

    public void sethoraExtras(double horaExtras) {
        this.horaExtras = horaExtras;
    }

    public double getvalorHorasExtra() {
        return valorHorasExtra;
    }

    public void setvalorHorasExtra(double valorHorasExtra){
        this.valorHorasExtra = valorHorasExtra;
    }

    @Override

    public double Funcionariocalcularsalario() {
        this.setsalariobase(getsalariobase() + (horaExtras * valorHorasExtra));
        return this.getsalariobase();
    }
}
