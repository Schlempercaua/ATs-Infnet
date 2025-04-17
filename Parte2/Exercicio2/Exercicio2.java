package Parte2.Exercicio2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        while (true) {
            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            if (validaSenha(senha)) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, " +
                        "conter uma letra maiúscula, um número e um caractere especial.");
            }
        }

        scanner.close();
    }

    public static boolean validaSenha(String senha) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(regex, senha);
    }
}
