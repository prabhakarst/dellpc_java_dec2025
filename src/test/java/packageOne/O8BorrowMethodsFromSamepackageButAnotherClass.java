package packageOne;

public class O8BorrowMethodsFromSamepackageButAnotherClass {
    public static void main(String[] args) {
        //will not throw error because belongs to same package
        O7MethodDeclarations.sumOfTwoNumbers(1,2);

        // it will throw error as it is privately declared
        //O7MethodDeclarations.display();
    }
}
