package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio015 {
    public static void main(String[] args) {

        int A = 5;
        int B = 6;
        int C = 7;

        double bhaskara = B * B - 4 * A * C;


        if (bhaskara >= 0 && A != 0) {

            double raiz1 = (-B + Math.sqrt(bhaskara)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(bhaskara)) / (2 * A);

            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {

            System.out.println("Impossível calcular");
        }
    }
}
