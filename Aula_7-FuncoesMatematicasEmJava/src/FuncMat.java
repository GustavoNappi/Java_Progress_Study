
public class FuncMat {
    public static void main(String[] args) throws Exception {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y  + " = " + B);
        System.out.println("raiz quadaraD de 25 " + C);

        A = Math.pow(x,y);
        B = Math.pow(y,x);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " Elevado a " + y + " = " + A);
        System.out.println(y + " Elevado a " + x + " = " + A);
        System.out.println("5.0 elvado a 2.0 é igual a " + C);

        A = Math.abs(z);


        System.out.println("o valor absoludo de " + z + " é " + A);


        

 

     }
}