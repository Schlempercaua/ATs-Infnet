import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();
        
        int parcelas;
        do {
            System.out.print("Digite a quantidade de parcelas (entre 6 e 48): ");
            parcelas = scanner.nextInt();
            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Número de parcelas inválido. Escolha entre 6 e 48.");
            }
        } while (parcelas < 6 || parcelas > 48);
        
        double taxaJuros = 0.03;
        double valorTotal = valorEmprestimo * Math.pow((1 + taxaJuros), parcelas);
        double valorParcela = valorTotal / parcelas;
        
        System.out.println("\nSimulação de Empréstimo para " + nome);
        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
        System.out.printf("Valor da parcela mensal: R$ %.2f\n", valorParcela);
        
        scanner.close();
    }
}
