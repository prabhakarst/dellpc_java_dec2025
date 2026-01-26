package accessModifieresUsingConstructorsPackage;

import com.google.gson.internal.bind.util.ISO8601Utils;

class Names {
    String fname;
    String lname;


    //we are not defining public here.This is default AM and can be accessed only within the package.
    Names() {
        System.out.println("default Constructor executed");
        fname = "Harris";
        lname = "Kamala";
        System.out.println("*******************************************");

    }

    //this can only be accessedin this class only and cannot create object outside this class
    private Names(String fname) {
        this.fname = fname;
        //this.lname=lname;
    }

    //public AM can be accessed anywhere within the project
    public Names(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
protected Names(String fname,String lname,String fname1,String lname1){
        this.fname=fname;
        this.lname=fname1+lname1;

}

    public void displaynames() {
        System.out.println(fname);
        System.out.println(lname);
    }

}

public class AccessModifiersUsingConstructors {
    public static void main(String[] args) {
        Names n1 = new Names();
        n1.displaynames();
        System.out.println("*******************************************");
//***********************************************************************************
        // allowed to access only withing the class above in this module only.
        //Names n2=new Names("Happy","Chicky");
        // ***********************************************************************************

        //accessing from parameterized constructor within same class
        Names n3=new Names("Chunky", "Bulky");
        n3.displaynames();

    }


}






