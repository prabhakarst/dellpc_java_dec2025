package classandpublicclass;
class car{
    public void cardis(){
        System.out.println("car");
    }
    public int sumclass(int c,int d){
        return c-d;
        //System.out.println(c-d);
    }
}
public class PublicClass {
public static void display(){
    System.out.println("up");
}
static int sum(int b,int c){
    return b+c;
}
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        display();
        System.out.println(sum(50,60));


        car var_car=new car();
        var_car.cardis();
        System.out.println(var_car.sumclass(90,10));

    }
}