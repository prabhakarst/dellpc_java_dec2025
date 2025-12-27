package packageOne;

public class O10MethodOverloading {


    public static void main(String[] args) {
        display_1();
        System.out.println(sum(1,2));
        System.out.println(sum(2,2.5));
        System.out.println(sum(1,3,5.5));
        O11ConstructorsConcepts.displayborrow();
    }
    private static void display_1(){
        System.out.println("private");

    }

        static int sum ( int a, int b)

        {
            int c = a + b;
            return c;
        }
        static double sum ( int a, double b){
            return a + b;
        }
        static double sum ( int a, int b, double c){
            double d = a + b + c;
            return d;
        }

    }
