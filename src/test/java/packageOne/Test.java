package packageOne;
class phone {
    int weight;
    String make;
    private int pt=3;


    public phone(int weight, String make) {
        this.weight = weight;
        this.make = make;
        System.out.println(pt);
    }
    public phone(){
        weight=50;
        make="OnePlus";
    }

    public void display_phone_details() {
        System.out.println(weight);
        System.out.println(make);
    }
    public  void setPhone(String make){

        this.make=make;
    }

    public String getPhone(){

        return make;
    }
}
public class Test {
    public static void main(String[] args) {
        phone p2=new phone(20,"Oppo");
        p2.display_phone_details();
        String res= (p2.make=="Oppo")?"yes":"No";
        System.out.println(res);
p2.setPhone("Samsung");
        System.out.println(p2.getPhone());
        phone p2_d=new phone();
        p2_d.display_phone_details();
int ck=2;
        System.out.println(ck);

    }
}
