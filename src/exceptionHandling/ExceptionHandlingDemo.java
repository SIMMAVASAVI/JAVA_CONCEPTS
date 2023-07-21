package exceptionHandling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calculate();

        try {
            int result = 5/5;
            System.out.println("RESULT : " + result);
        } catch (Exception e) {
            System.out.println("Some exception has occured");
        } finally {
            System.out.println("Code in finally block");
        }

    }
}

