package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio003 {

    //Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado de um número A é representado por A² = A * A.

    public static void main(String[] args) {

        int A= 5;
        int B = 19;

        int quadradoA = A * A;

        System.out.println("Quadrado A é igual " +quadradoA);

        int quadradoB = B * B;

        System.out.println("Quadrado B é igual " +quadradoB);

        int resultado = quadradoA + quadradoB;

        System.out.println("A soma dos quadrados é "+resultado);
    }



}
