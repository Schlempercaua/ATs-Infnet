import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] messages = new String[10];
        
        System.out.print("Digite o nome do primeiro usuário: ");
        String user1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String user2 = scanner.nextLine();
        
        for (int i = 0; i < 10; i++) {
            String currentUser = (i % 2 == 0) ? user1 : user2;
            System.out.print(currentUser + ", digite sua mensagem: ");
            messages[i] = currentUser + ": " + scanner.nextLine();
        }
        
        System.out.println("\n===== Histórico de Mensagens =====");
        for (String message : messages) {
            System.out.println(message);
        }
        
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");
        
        scanner.close();
    }
}
