import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double Lar; 
        double Comp;
        double prt;

        
        System.out.print("Qual a Largura do terrno?: ");
        Lar = sc.nextDouble();

        System.out.print("Qual Comprimento?: ");
        Comp = sc.nextDouble();

        System.out.print("Qual o valor do terreno: ");
        prt = sc.nextDouble();




        Double ar = Lar*Comp ;

        Double pr = ar*prt;

        System.out.println("Esse Vai ser o valor da area do terreno: " + ar);
        System.err.println("E essa vai ser o valor terreno calculando a area completinha:%.2f%n " +  pr);

        sc.close();

     
 

     }
}