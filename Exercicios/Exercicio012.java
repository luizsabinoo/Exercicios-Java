package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio012 {
    public static void main(String[] args) {
        int L = 10;
        int R = 10;

        int areaQuadrado = L * L;
        double areaCirculo = 3.14 * R * R;

        if (areaQuadrado > areaCirculo) {
            System.out.println("Quadrado");
        } else {
            System.out.println("Círculo");
        }
    }
}
