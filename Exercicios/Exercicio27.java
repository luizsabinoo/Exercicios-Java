public class Exercicio27 {
    public static void main(String[] args) {

        int quantidadeAlunos = 5;


        int[] notas = {80, 90, 75, 85, 95};


        int soma = 0;
        int indice = 0;


        while (indice < quantidadeAlunos) {
            soma += notas[indice];
            indice++;
        }


        double media = (quantidadeAlunos > 0) ? (double) soma / quantidadeAlunos : 0;


        System.out.println("A média aritmética das notas é: " + media);
    }
}
