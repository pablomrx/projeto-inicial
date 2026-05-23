package modulo04;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Spider Man";
        String tipoConta = "Corrente";
        double saldo = 1799.99;

        System.out.println("*****************************");
        System.out.printf("Nome do cliente: %s%n", nome);
        System.out.printf("Tipo conta: %s%n", tipoConta);
        System.out.printf("Saldo atual: %.2f%n", saldo);
        System.out.println("*****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferência bancária
                3 - Receber valor
                4 - Sair
                """;

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("Seu saldo atual é: %.2f%n%n", saldo);

            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor <= 0) {
                    System.out.println("Digite um valor válido!");
                } else if (valor > saldo){
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.printf("Novo saldo: %.2f%n%n", saldo);

                }
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja receber: ");
                double valor = leitura.nextDouble();
                if (valor <= 0) {
                    System.out.println("Digite um valor válido!");
                } else {
                    saldo += valor;
                    System.out.printf("Novo saldo: %.2f%n%n", saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
        leitura.close();
    }
}