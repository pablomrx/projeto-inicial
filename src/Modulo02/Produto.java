package Modulo02;

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double valorTotal = precoProduto * quantidade;

        String mensagem = String.format("O valor total da compra é: R$%.2f", valorTotal);
        System.out.println(mensagem);
    }
}
