package testpackage;
class pizza {
    String name_piz;
    int price;
    static int size;

public pizza(String name_piz,int price){
    this.name_piz=name_piz;
    this.price=price;

}
public void display_piz_details(){
        System.out.println("size is "+size);
        System.out.println("name is "+name_piz);
        System.out.println("price "+ price);;
    }
}

public class Test01 {
    public static void main(String[] args) {
        pizza p1=new pizza("Paneer",200);
        pizza.size=8;
                p1.display_piz_details();

    }
}
