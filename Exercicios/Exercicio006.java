package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio006 {
    public static void main(String[] args) {

        int A = 5;
        int B = 6;
        int C = 7;

        int areaDoTrianguloRetangulo = A * C/2;
        double areaDoCirculoDeRaio = 3.14 * C * C;
        int areaDoTrapezio = (A + B) * C/2;
        int areaDoQuadrado = B * A;
        int areaDoRetangulo = A * B;
        int perimetroDoRetangulo = 2 * (A + B);

        System.out.println(areaDoTrianguloRetangulo);
        System.out.println(areaDoTrapezio);
        System.out.println(areaDoQuadrado);
        System.out.println(areaDoRetangulo);
        System.out.println(perimetroDoRetangulo);
        System.out.println(areaDoCirculoDeRaio);
    }
}
