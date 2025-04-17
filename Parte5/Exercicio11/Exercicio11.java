package Parte5.Exercicio11;
import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numerosSorteados = new HashSet<>();
        Set<Integer> numerosUsuario = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        System.out.println("Insira 6 números entre 1 e 60:");
        while (numerosUsuario.size() < 6) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int num = scanner.nextInt();
            
            numerosUsuario.add(num);
            
        }

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosUsuario);
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);
    }
}
