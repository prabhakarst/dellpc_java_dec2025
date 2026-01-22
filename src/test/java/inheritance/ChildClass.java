package inheritance;

public class ChildClass extends ParentClass{
    public void triangle(){
        System.out.println("Triangle:child");
    }

    @Override
    public void square(){
        super.square();
        System.out.println("Square: child extends parent and overidden");

    }
}
