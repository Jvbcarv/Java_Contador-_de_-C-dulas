package alura;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            int valor = 0;

            // Solicitar valor válido entre 1 e 1000
            do {
                System.out.println("Digite um valor entre 1 e 1000:");
                valor = scanner.nextInt();

                if (valor < 1 || valor > 1000) {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            } while (valor < 1 || valor > 1000);

            int original = valor;

            // Contar cédulas
            int notas100 = 0;
            int notas50 = 0;
            int notas20 = 0;
            int notas10 = 0;
            int notas5 = 0;
            int notas1 = 0;

            while (valor >= 100) {
                notas100++;
                valor -= 100;
            }
            while (valor >= 50) {
                notas50++;
                valor -= 50;
            }
            while (valor >= 20) {
                notas20++;
                valor -= 20;
            }
            while (valor >= 10) {
                notas10++;
                valor -= 10;
            }
            while (valor >= 5) {
                notas5++;
                valor -= 5;
            }
            while (valor >= 1) {
                notas1++;
                valor -= 1;
            }

            // Exibir resultado
            System.out.println("Notas para o valor " + original + ":");
            System.out.println(notas100 + " nota(s) de 100");
            System.out.println(notas50 + " nota(s) de 50");
            System.out.println(notas20 + " nota(s) de 20");
            System.out.println(notas10 + " nota(s) de 10");
            System.out.println(notas5 + " nota(s) de 5");
            System.out.println(notas1 + " nota(s) de 1");

            // Perguntar se deseja continuar
            System.out.println("Deseja realizar outra operacao? (s/n)");
            continuar = scanner.next();

            while (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n")) {
                System.out.println("Resposta inválida. Digite 's' para sim ou 'n' para não:");
                continuar = scanner.next();
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}