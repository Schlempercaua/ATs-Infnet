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
            
            String erro = validaSenha(senha);
            if (erro == null) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Erro: " + erro);
            }
        }
        
        scanner.close();
    }
    
    public static String validaSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }
        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!Pattern.compile("\\d").matcher(senha).find()) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!Pattern.compile("[@#$%^&+=!]").matcher(senha).find()) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }
        return null;
    }
}
