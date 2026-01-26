package accessModifieresUsingConstructorsPackage.subpackage;

//import accessModifieresUsingConstructorsPackage.NamesClass;
import accessModifieresUsingConstructorsPackage.ProtectedNamesClass;

public class AccessModifiersProtected extends ProtectedNamesClass {
    public AccessModifiersProtected(String fname1,String mname1,String lname1){
        super(fname1,mname1,lname1);
    }

    public static void main(String[] args) {
       AccessModifiersProtected pro=new AccessModifiersProtected("j","k","L");
       pro.displayNamesClass();
    }
}
