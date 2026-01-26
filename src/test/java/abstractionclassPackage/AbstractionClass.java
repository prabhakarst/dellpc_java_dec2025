package abstractionclassPackage;

public abstract class AbstractionClass {
    //abstract vars are not allowed
   // abstract int a=10;

    // abstract constructors are not allowed
//    abstract AbstractionClass(){
//    }

    abstract int sum(int a, int b);
    abstract void display();

//    private void display_pvt(){
//        System.out.println("Private");
//    }
    public void concreteMethodDisplay(){
        System.out.println("this is a concrete method");
    }
}
