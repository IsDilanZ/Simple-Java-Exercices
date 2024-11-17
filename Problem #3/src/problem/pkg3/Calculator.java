
package problem.pkg3;

/**
 *
 * @author user
 */
public class Calculator {
    
    public void title(){
        borderln();
        System.out.println("               MINI CALCULATOR                  ");
        borderln();
    }
    
    public void borderln(){
        System.out.println("-----------------------------------------------");
    }
    
    public void sum(double a, double b){
        borderln();
        System.out.println(" The result of adding Alpha to Beta is: " +(a + b));
    }
    public void subs(double a, double b){
        borderln();
        System.out.println(" The result of subtracting Alpha to Beta is: " +(a - b));
    }
    public void product(double a, double b){
        borderln();
        System.out.println(" The result of multiplying Alpha to Beta is: " + (b * a));
    }
        public void div(double a, double b){
        borderln();
        if(b != 0){System.out.println(" The result of splitting Alpha to Beta is: " + (a / b));
        } else {System.out.println(" Indeterminate number!");}
    }
    public void squaredA(double a){
        borderln();
        System.out.println(" The result of squaring Alpha is: " + (a*a));
    }
    public void sqrtB(double b){
        borderln();
        if(b < 0){System.out.println(" Oops complex number ;)");} 
        else{System.out.println(" The result of square rooting Beta is: " + (Math.sqrt(b)));}
    }
}
