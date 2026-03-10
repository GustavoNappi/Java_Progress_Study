import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou
        // ímpar.
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Digite um numero para ver se é Par ou impar: ");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("É PAR");
        } else {
            System.out.println("É IMPAR");
        }
        sc.close();

    }

}
