package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio018 {
    public static void main(String[] args) {

        int A = 6;
        int B = 7;
        int C = 8;

        if (A >= B + C || B >= A + C || C >= A + B) {
            System.out.println("Não forma triângulo");
        } else if (A * A == B * B + C * C || B * B == A * A + C * C || C * C == A * A + B * B) {
            System.out.println("Triângulo Retângulo");
        } else if (A * A > B * B + C * C || B * B > A * A + C * C || C * C > A * A + B * B) {
            System.out.println("Triângulo Obtusângulo");
        } else if (A * A < B * B + C * C || B * B < A * A + C * C || C * C < A * A + B * B) {
            System.out.println("Triângulo Acutângulo");
        }

        if (A == B && B == C) {
            System.out.println("Triângulo Equilátero");
        } else if (A == B || A == C || B == C) {
            System.out.println("Triângulo Isósceles");
        }
    }
}
