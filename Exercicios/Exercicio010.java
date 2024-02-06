package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio010 {
    public static void main(String[] args) {

        String nome = "João";
        int salarioFixo = 2000;
        int vendas = 200;
        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println(salarioFinal);

    }
}
