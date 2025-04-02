package Questão9;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Cauã Schlemper", 1000);
        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(1500);
        conta.exibirSaldo();
    }
}
