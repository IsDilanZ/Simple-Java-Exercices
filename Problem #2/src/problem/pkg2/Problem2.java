
package problem.pkg2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Process calc = new Process();
        
        System.out.println(" Calculate x = (a + (b+3) + (c-d))/(b-c)");
        System.out.println("------------------------------------------");
        System.out.print("Enter a: ");
        double valueA = reader.nextInt();
        
        System.out.print("Enter b: ");
        double valueB = reader.nextInt();
                
        System.out.print("Enter c: ");
        double valueC = reader.nextInt();
                
        System.out.print("Enter d: ");
        double valueD = reader.nextInt();
        
        
        System.out.println("------------------------------------------");
        calc.calculate(valueA, valueB, valueC, valueD);
        System.out.println();
    }
    
}
