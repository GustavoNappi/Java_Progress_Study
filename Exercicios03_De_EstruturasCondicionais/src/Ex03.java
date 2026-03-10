
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
// ordem crescente ou decrescente.

    Scanner sc = new Scanner(System.in);

    int a;
    int b;


    System.out.print("Digite o valor de a: ");
     a = sc.nextInt();
    System.out.print("Digite o valor de b: ");
     b= sc.nextInt();

     if (a % b == 0 || b % a == 0 ){
        System.err.print(" São multiplos! ");
     }else{System.out.print(" Não são multiplos! ");}
    
     sc.close();
    }

}
