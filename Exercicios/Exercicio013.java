package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio013 {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 10;
        int n3 = 7;


        int tempMaior = Math.max(n1, n2);
        double maior = Math.max(tempMaior, n3);

        System.out.println("O maior número é " + maior);
    }
}
