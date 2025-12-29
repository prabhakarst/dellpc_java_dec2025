package packageOne;

public class O18ExceptionHandling {
    public static void main(String[] args) {
        try {
            //String abc = null;
           // int len = abc.length();
            //*******************************************
           // int  numb=50/0;
            //*******************************************
            String exc="Hello";
            char exception_stacktrace=exc.charAt(6000);
            System.out.println(exc);
            //*******************************************

        } catch (NullPointerException e1) {
            System.out.println("string is null");
        }
        catch(ArithmeticException e2){
            System.out.println("Arithmetic Exception occured");
        }
catch(Exception e3){
    e3.printStackTrace();
}
    }
}