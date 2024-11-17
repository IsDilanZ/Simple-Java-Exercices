
package phactorialpoo;

/**
 *
 * @IsDilanZ
 */
public class FactorialProcess {
    double Factorial;  
    public void factorialNum(int nCase){
        Factorial = 1;
        for(int i = 1; nCase >= i ; i++){ Factorial =  Factorial * i;}
        System.out.println(Factorial);
    }
}
