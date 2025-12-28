package packageOne;

public class O17SwitchLambdaCalculator {

    public static void calc(double a,double b, String oper){
   switch (oper){
       case "sum","add" -> System.out.println(a+b);
       case "product","multiply" -> System.out.println(a*b);
       case "log" -> System.out.println(Math.log(b));
       case "exponent", "power" ->System.out.println(Math.pow(a,b));
       case "factorial" -> {
           int f=1;
           for (int i = 1; i <= a; i++) {

                f= f * i;

           }
           System.out.println(f);
       }

       default -> System.out.println("invalid operator used");
        }
    }
    public static void main(String[] args) {

        calc(3,4,"factorial");

    }

}
