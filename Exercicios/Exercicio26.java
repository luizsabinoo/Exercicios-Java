public class Exercicio26 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidadePares = 0;

        for (int numero = 13; numero <= 73; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
                quantidadePares++;
            }
        }

        if (quantidadePares > 0) {
            double media = (double) soma / quantidadePares;
            System.out.println("Média aritmética dos números pares: " + media);
        } else {
            System.out.println("Não há números pares no intervalo especificado.");
        }
    }
}
