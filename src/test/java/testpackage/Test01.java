package testpackage;

import java.util.Arrays;

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
    public void sett(int price){
    this.price=price;
    }
    public int gett(){
    return price;
    }
}

public class Test01 {
    public static void main(String[] args) {
        String name="hello pizza co Ltd.";
        //Convert staring to an array of characters
        char ch[]=name.toCharArray();
        System.out.println("Convert string to an array of characters " +Arrays.toString(ch));

        //Convert String to an array
        String arr[]=name.split(" ");
        System.out.println("Convert String to an array "+Arrays.toString(arr));

        pizza p1=new pizza("Paneer",200);
        pizza.size=8;
                p1.display_piz_details();
                p1.sett(900);
                p1.display_piz_details();
        System.out.println(p1.gett());
//*************************************
        try {
            int try_catch=20;
            System.out.println(try_catch / 0);
        }
        catch(ArithmeticException e1){
            throw new ArithmeticException("AE");
            //System.out.println("Arithmetic error");
        }
        //*******************************
    }
}
