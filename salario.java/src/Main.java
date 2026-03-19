public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", 2000);
        Gerente g1 = new Gerente("Maria", 4000, 1500);
        Desenvolvedor d1 = new Desenvolvedor("Carlos", 3000, 10, 50);

        f1.exibirFuncionario();
        g1.exibirFuncionario();
        d1.exibirFuncionario();
    }
}
