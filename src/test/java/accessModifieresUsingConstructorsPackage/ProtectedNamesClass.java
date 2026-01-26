package accessModifieresUsingConstructorsPackage;


public class ProtectedNamesClass {
String fname1;
String lname1;
String mname1;
    protected ProtectedNamesClass(String fname1,String mname1,String lname1){
        this.fname1=fname1;
        this.mname1=mname1;
        this.lname1=fname1+mname1;
    }
    public void displayNamesClass(){
        System.out.println(fname1);
        System.out.println(mname1);
        System.out.println(lname1);
    }

}



