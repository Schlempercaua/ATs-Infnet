package Questão6;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Gol", 2020, 50000);
        Veiculo v2 = new Veiculo("DEF-5678", "Voyage", 2018, 70000);

        v1.exibirDetalhes();
        v1.registrarViagem(150);
        v1.exibirDetalhes();

        v2.exibirDetalhes();
        v2.registrarViagem(300);
        v2.exibirDetalhes();
    }
}
