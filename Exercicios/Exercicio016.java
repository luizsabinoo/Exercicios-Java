package academy.devdojo.maratonajava.javacore.Exercicios;

public class Exercicio016 {
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
    public static void main(String[] args) {

        double horaInicial = 05.00;
        double horaFinal  = 10.00;
        double duracao = horaInicial - horaFinal;

        if (duracao >= 24.00){
            System.out.println("Hora Maxima atingida ");
        }else if (1.00 < duracao){
            System.out.println("Hora minima não atingida");
        }else {
            System.out.println("Hora de jogo jogada " +duracao);
        }
    }
}
