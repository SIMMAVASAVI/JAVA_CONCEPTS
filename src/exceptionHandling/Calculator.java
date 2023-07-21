package exceptionHandling;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Calculator {

    public void calculate(){
        while(true){
            int result=0;
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                result=x/y;
                System.out.println("In try block ");
            }
            catch (ArithmeticException ae){// Specialized Exception
                System.out.println("caught the arithmetic error "+ae);
            }
            catch (Exception e){ // Generalised Exception
                System.out.println("caught Exception");
            }
            finally {
                System.out.println("In finally block");
            }
            System.out.println("result is: "+ result);
        }
    }
}
