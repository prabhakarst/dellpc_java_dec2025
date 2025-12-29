package packageOne;

public class O19CustomizedExceptionHandling {
    public static void main(String[] args) {
       try {
           int cust_exception = 23 / 0;
       }
       catch(ArithmeticException e1){
           throw new ArithmeticException("Divided by infinity,please check");
       }
    }
}
