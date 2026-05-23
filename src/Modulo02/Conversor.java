package Modulo02;

public class Conversor {
        static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Conversor de Celsius para Fahrenheit");

        double cel = 16;
        double fah = celsiusParaFahrenheit(cel);

        String mensagem = String.format("A temperatura de %.1f em Celsius equivale a %.2f em Fahrenheit", cel, fah);
        System.out.println(mensagem);

        int fahInteiro = (int) fah;
        System.out.printf("A temperatura de Fahrenheit inteira é: %d", fahInteiro);
    }
}
