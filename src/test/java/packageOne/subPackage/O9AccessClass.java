package packageOne.subPackage;

import packageOne.O7MethodDeclarations;

public class O9AccessClass {
    public static void main(String[] args) {
        //will throw error because we are using this inside another package
        //O7MethodDeclarations.sumOfTwoNumbers(22,24);

        //I can call main inside subpackage as it is declared publicly.
        O7MethodDeclarations.main(args);
    }
}
