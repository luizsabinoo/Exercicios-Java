package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio33 {
    public static void main(String[] args) {
//        Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário. Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar (ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO. Utilize o laço DO-WHILE.

        int n1 = 0;

        do {
            if (n1 == 0){
                System.out.println("Nulo");
                return;
            } else if (n1 % 2 == 0 ) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");

            }
            if (n1 < 0){
                System.out.println("NEGATIVO");
            }else {
                System.out.println("POSITIVO");
            }

        }while (n1 == 0);



    }
}
