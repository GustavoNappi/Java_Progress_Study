import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.print("Digite a hora incial: ");
        horaInicial = sc.nextInt();

        System.out.print("Digite a hora Final: ");
        horaFinal = sc.nextInt();

        if (horaInicial > horaFinal || horaInicial < horaFinal) {
            duracao = 24 - (horaInicial - horaFinal);

            System.out.print("O JOGO DUROU " + duracao + " HORA(S)");

        } else {
            System.out.println("Digite um valor valido ne pae");
        }

        sc.close();
    }

}
