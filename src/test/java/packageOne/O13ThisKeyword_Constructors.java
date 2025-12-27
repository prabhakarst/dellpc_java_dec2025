package packageOne;
class names {
    //instance variable: declared at class level
    String FN;
    String SN;

    public names(String FN,String SN) {
        // this keyword is used to differentiate between instance(class) and local(method) variables
        this.FN = FN;
        this.SN = SN;
    }

    public void display_names() {
        System.out.println(FN);
        System.out.println(SN);
        System.out.println("********************************");
    }
}
public class O13ThisKeyword_Constructors {


    public static void main(String[] args) {

        //default constructor
        names c3=new names("P","S");

        c3.display_names();

    }

}
