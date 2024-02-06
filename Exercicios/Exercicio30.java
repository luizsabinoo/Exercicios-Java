package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio30 {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 0;

        while (numero1 <= 3) {
            System.out.println(numero1);
            System.out.println(numero2);
            numero1+= 1;
            numero2-= 1;
        }
        while (numero1 >= 0){
            System.out.println(numero1);
            System.out.println(numero2);
            numero1-= 1;
            numero2 += 2;
        }
    }
}
