import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é
        // negativo ou não.
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Digite um número para saber se é positivo ou negativo: ");
        x = sc.nextInt();

        if (x > 0) {
            System.out.print("POSITIVO");
        } else {
            System.out.print("NEGATIVO");
        }

        sc.close();

    }

}
