package Parte3.Exercicio6;

class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    private Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    private void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("------------------------");
    }

    private void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Viagem registrada: " + km + " km");
        } else {
            System.out.println("A quilometragem da viagem deve ser positiva.");
        }
    }

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