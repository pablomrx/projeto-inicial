package Modulo02;

public class Formatacao {
    public static void main(String[] args) {
        String nome = "Pablo";
        int idade = 24;
        double altura = 1.83;

        System.out.printf("Nome: %s | idade: %d | altura: %.2f%n", nome, idade, altura);

        String saudacao = "Olá, meu nome é ";
        String continuacao = " e minha idade é ";
        System.out.println(saudacao + nome + continuacao + idade);
    }
}
