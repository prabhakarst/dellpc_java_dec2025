package packageOne;
class address{
    String addr;
static String city;
    public address(String addr){
      this.addr=addr;
    }

    public void display_addr(){
        System.out.println(addr);
        System.out.println(city);
        System.out.println("++++++++++++++++++++++++++");
    }
    //I want to update "JPN" without creating an object
    public void setAddr(String addr){
        this.addr=addr;
    }
    public String getAddr(){
        return addr;
    }
}
public class O14SettersAndGetters {
    public static void main(String[] args) {
        address.city="Bangalore";
        address a1=new address("JPN");
        a1.display_addr();
        a1.setAddr("Begur Road");
        System.out.println(a1.getAddr());
    }
}
