package packageOne;
class pizza{
    String veg;
    String NV;
public pizza(String veg,String NV){
    this.veg=veg;
    this.NV=NV;
}
public void display_pizza_menu(){
    System.out.println(veg);
    System.out.println(NV);

}
public void setPizza(String veg){
    this.veg=veg;
}
public String getPizza(){
    return veg;
}
}
public class O14TernaryOp {
    public static void main(String[] args) {
        int a=103;
        String result=(a%2==0)?"even":"odd";
        System.out.println(result);
        pizza p1=new pizza("mushroom","chicken");
        p1.display_pizza_menu();
        p1.setPizza("paneer");
        System.out.println(p1.getPizza());
        String pizza_veg_update=(p1.getPizza()=="paneer")?"veg record updated":"veg record not updated";
        System.out.println(pizza_veg_update);
    }
}
