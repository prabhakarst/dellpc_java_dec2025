package packageOne;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class O20Arrays {
    public static void main(String[] args) {
//        int a1[]=new int[5];
//        System.out.println(a1);
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.fill(a1,20));
//        int b1=Arrays.copyOf(a1,10);
//        System.out.println(Arrays.toString(b1));

        for(int i=10;i>=0;i--){
            System.out.println(i);
        }

        //convert String to array of characters
String arr_convert_to_char="Sample Test Data";
        char[] e1=arr_convert_to_char.toCharArray();
    System.out.println("convert string to array of characters "+ Arrays.toString(e1));

    //find the length of String array
String d1[]=arr_convert_to_char.split(" ");
        System.out.println("length of String array " +d1.length);

        //convert string to an array
        System.out.println("convert string to an array "+Arrays.toString(d1));


        int a=10; int b=20;
        int t;
        System.out.println(a);
        System.out.println(b);
        t=a; // t=10
        a=b;// a=20;
        b=t; //b=10;
        System.out.println(a);
        System.out.println(b);
    }


}
