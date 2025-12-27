package packageOne;
class cars1{
    int p1rice;
    String m1odel;
    static int tyre;

    public cars1(){
        p1rice=1400000;
        m1odel="Merc";
    }
    public void displaycardetails(){
        System.out.println(p1rice);
        System.out.println(m1odel);
        System.out.println(tyre);
    }

        }
public class O11ConstructorsConcepts {
    public static void displayborrow(){
        System.out.println("test:using in 10");
    }

    public static void main(String[] args) {
        cars1 c1=new cars1();
        c1.m1odel="BMW";
        System.out.println(c1.m1odel.substring(1));
        displayborrow();
        c1.p1rice=5000000;
        cars1.tyre=4;
        if(c1.m1odel=="BMW") {
            c1.displaycardetails();
        }
        else{
            System.out.println("no");
        }
        cars1 c2=new cars1();
        c2.displaycardetails();

    }
}