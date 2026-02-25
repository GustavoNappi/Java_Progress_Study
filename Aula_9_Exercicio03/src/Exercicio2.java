import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
    
       // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
       // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         Scanner sc = new Scanner(System.in);
       int A;
       int B;
       int C;
       int D;
        
         

       System.out.print("Insira o primeiro valor: ");
       A = sc.nextInt();

       System.out.print("Insira o segundo valor: ");
       B = sc.nextInt();

       System.out.print("Insira o terceiro valor: ");
       C = sc.nextInt();


       System.out.print("Insira o quarto valor: ");
       D = sc.nextInt();




       int DIFERENÇA = (A*B - C*D);

        System.out.println("A diferença dos valores do produto: " + DIFERENÇA);
        
     }
}