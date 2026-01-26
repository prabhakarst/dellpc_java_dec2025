package abstractionclassPackage;

public class ImplementingClass extends AbstractionClass {
@Override
    void display(){
    System.out.println("write logic of abstract class in Implementing class");
}
    @Override
    int sum(int a,int b){
        return a+b;
    }
//@Override
// void display_pvt(){
//    System.out.println("Private2");
//}
    public static void main(String[] args) {
ImplementingClass obj=new ImplementingClass();
        System.out.println(obj.sum(1,2));
obj.display();

    }
}
