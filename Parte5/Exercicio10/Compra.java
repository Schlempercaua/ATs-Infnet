package Parte5.Exercicio10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Compra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return produto + ", " + quantidade + ", " + precoUnitario;
    }

    private static final String FILE_NAME = "compras.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro da compra " + (i + 1) + ":");
            System.out.print("Produto: ");
            String produto = scanner.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Preço unitário: ");
            double precoUnitario = scanner.nextDouble();
            scanner.nextLine();

            compras.add(new Compra(produto, quantidade, precoUnitario));
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Compra compra : compras) {
                writer.write(compra.toString());
                writer.newLine();
            }
            System.out.println("Compras registradas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar as compras: " + e.getMessage());
        }

        System.out.println("\nCompras registradas no arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
