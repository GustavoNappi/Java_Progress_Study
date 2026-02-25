import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws Exception {
    //Enunciado do exercicio    
            // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
            // casas decimais conforme exemplos. 
            // Fórmula da área: area = π . raio2 
            // Considere o valor de π = 3.14159 

        //iniciando o scanner
        Scanner sc = new Scanner(System.in);



        //Variaveis
        double raio;
        double pi =  3.14159;

        



        //Iniciando as variaveis
        System.out.print("Digite o valor do seu raio:");
        raio = sc.nextFloat();
        double A = pi*Math.pow(raio, 2);


        System.out.print("O valor do circulo:  " + A);


        sc.close();





     }
}