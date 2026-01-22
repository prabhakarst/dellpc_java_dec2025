package inheritance;

public class InheritanceConcepts {
    public static void main(String[] args) {
        ChildClass c=new ChildClass();
        c.triangle();
        c.square();
        c.shapes();
        //ParentClass p=new ParentClass();
       //p.square();

       //Method overloading
        System.out.println(sum(1,2));
        System.out.println(sum(100.5,50,25));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static double sum(double a,double b, int x){
        return a+b-x;
    }
}
