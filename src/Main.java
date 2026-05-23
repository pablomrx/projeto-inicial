public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.printf("Ano de lançamento: %d%n", anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // média das notas do filme
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println("nota média: " +media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("sinopse: " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
