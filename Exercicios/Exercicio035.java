public class Exercicio035 {
    public static void main(String[] args) {
        int n1 = 10;

        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Os primeiros " + n1 + " números da série de Fibonacci:");

        for (int i = 0; i < n1; i++) {
            System.out.print(numeroAnterior + " ");

            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
    }
}
