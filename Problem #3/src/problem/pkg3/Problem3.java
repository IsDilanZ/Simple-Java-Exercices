
package problem.pkg3;
import java.util.Scanner;
/**
 *
 * @IsDilanZ
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        Calculator action = new Calculator();
        
        action.title();
        System.out.print(" Enter ALPHA value: ");
        double alpha = reader.nextDouble();
        action.borderln();
        System.out.print(" Enter BETA value: ");
        double beta = reader.nextDouble();

        action.sum(alpha, beta);
        action.subs(alpha, beta);
        action.product(alpha, beta);
        action.div(alpha, beta);
        action.squaredA(alpha);
        action.sqrtB(beta);
        action.borderln();        
    }
    
}
