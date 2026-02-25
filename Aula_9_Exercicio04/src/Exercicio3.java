import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
    
      

      // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
      // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
      // decimais.

      Scanner sc = new Scanner(System.in);

      int numeroF;
      int NHorasT;
      double VRecebeHora;

      System.out.print("Digite o valor do funcionario: ");
      numeroF = sc.nextInt();

      System.out.print("Digite o Número de horas trabalhadas: ");
      NHorasT = sc.nextInt();

      System.out.printf("Digite o valor que recebe em Horas: ");
      VRecebeHora = sc.nextDouble();

      sc.close();

      double Salario = VRecebeHora * NHorasT;

      System.out.println("O Numero do Funcionario é: " + numeroF);
      System.out.println(" ");
      System.out.printf("O Salario do Funcionario é: %.2f", Salario);








     }
}