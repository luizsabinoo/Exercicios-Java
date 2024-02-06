package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio017 {
    public static void main(String[] args) {

        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;

        if ((C > D) || (D < A) || (C + D > A + B) || (C > 0 || D > 0) || (A % 2 == 0)){
            System.out.println("Valores Aceitos");
        }else{
            System.out.println("Valores Não aceitos");
        }

    }
}
