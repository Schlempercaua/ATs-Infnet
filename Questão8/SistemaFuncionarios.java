package Questão8;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Cauã", 5000);
        Funcionario estagiario = new Estagiario("Daiene", 2000);

        System.out.println(gerente.getNome() + " - Salário final: R$ " + gerente.calcularSalario());
        System.out.println(estagiario.getNome() + " - Salário final: R$ " + estagiario.calcularSalario());
    }
}
