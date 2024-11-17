
package problem.pkg1;
import java.util.Scanner;

/**
 *
 * @IsDilanZ
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Process calc = new Process();
        
        System.out.println(" Calculate x = a/b + 1");
        System.out.println("------------------------");
        System.out.print("Enter a: ");
        double valueA = reader.nextInt();
        
        System.out.print("Enter b: ");
        double valueB = reader.nextInt();
        
        System.out.println("------------------------");
        calc.calculate(valueA, valueB);
        System.out.println();
    }
    
}
