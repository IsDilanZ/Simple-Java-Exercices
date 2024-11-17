package phactorialpoo;
import java.util.Scanner;
/**
 *
 * @IsDilanZ
 */
public class PhactorialPOO {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int value;
        
        FactorialProcess excecute = new FactorialProcess();
        Scanner read = new Scanner(System.in);
        
        System.out.print("Type the number you want to use: ");
        value = read.nextInt();
        System.out.print("Your factorial is : ");
        excecute.factorialNum(value);
    }
    
}
