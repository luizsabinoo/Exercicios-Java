public class Exercicio24 {
    public static void main(String[] args) {
        int quantidadeAlunos = 5;
        int contador = 1;

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        char sexoMaisVelho = ' ';

        do {
            System.out.println("Aluno #" + contador);

            String nome = "Aluno" + contador;
            int idade = 20 + contador;
            char sexo = (contador % 2 == 0) ? 'F' : 'M';

            if (idade > idadeMaisVelho) {
                nomeMaisVelho = nome;
                idadeMaisVelho = idade;
                sexoMaisVelho = sexo;
            }

            contador++;
        } while (contador <= quantidadeAlunos);

        System.out.println("Dados do aluno mais velho:");
        System.out.println("Nome: " + nomeMaisVelho);
        System.out.println("Idade: " + idadeMaisVelho);
        System.out.println("Sexo: " + sexoMaisVelho);
    }
}
