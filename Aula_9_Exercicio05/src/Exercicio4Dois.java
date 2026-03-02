import java.util.Scanner;

public class Exercicio4Dois {
    public static void main(String[] args) throws Exception {
    
      

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
      Scanner sc = new Scanner(System.in);
      
      int CodigoPeca1;
      int NumeroPecas1;
      int CodigoPeca2;
      int NumeroPecas2;
      double ValorUnitarioPeca1;
      double ValorUnitarioPeca2;
      
      System.out.print("Digite o codigo do produto 1: ");
      CodigoPeca1 = sc.nextInt();
      System.out.println(CodigoPeca1);

      System.out.print("Numero de peças: ");
      NumeroPecas1 = sc.nextInt();


      System.out.print("O valor de peça: ");
      ValorUnitarioPeca1 = sc.nextDouble();

      System.out.print("Digite o codigo do produto 2: ");
      CodigoPeca2 = sc.nextInt();
      System.out.println(CodigoPeca2);


      System.out.print("Numero de peças do produto digitado: ");
      NumeroPecas2 = sc.nextInt();

      System.out.print("O valor de peça: ");
      ValorUnitarioPeca2 = sc.nextDouble();

      sc.close();

      double CalculoPeca1 = NumeroPecas1 * ValorUnitarioPeca1;
      double CalculoPeca2 = NumeroPecas2 * ValorUnitarioPeca2;

      double calculoTotal = CalculoPeca1 + CalculoPeca2;
      
      
      System.out.printf("total de tudo: %.2f%n", calculoTotal );

      
        




      

      







     }
}