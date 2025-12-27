package packageOne;

public class O7MethodDeclarations {
    public static void main(String[] args) {
       display();
        System.out.println(sumOfTwoNumbers(10,20));
    }
    private static void display(){
        System.out.println("private static display:access only within the class");
    }
    static int sumOfTwoNumbers(int a,int b){
        int c=a+b;
        return c;
    }
}
