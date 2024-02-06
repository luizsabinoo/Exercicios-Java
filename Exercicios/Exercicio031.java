public class Exercicio031 {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 1;
        int numero4 = 3;

        while (numero1 <= 20) {
            int resposta = numero1 * numero2;
            System.out.println(numero1 + " * " + numero2 + " = " + resposta);

            numero1 += 1;
            numero2 += 1;
        }

        System.out.println("-------------------------------------");

        while (numero3 <= 20){

            int resposta1 = numero3 * numero4;
            System.out.println(numero3 + " * " + numero4 + " = " + resposta1);

            numero3 +=1;
            numero4 +=1;
        }
    }
}
