package packageOne;
//Strings are immutable
//String buffer is mutable
public class O23StringBuffer {
    public static void main(String[] args) {

        StringBuffer sb1=new StringBuffer("hello");
        sb1.append("world");
        System.out.println("append "+sb1);
        sb1.append("test");
        System.out.println("append again "+sb1);

        sb1.deleteCharAt(5);
        System.out.println("delete char at a particular index "+sb1);

        sb1.insert(5,"W");
        System.out.println("insert at a particular index position " + sb1);

        System.out.println("replace a word "+sb1.replace(0,5,"Hi"));
        //System.out.println("reverse "+sb1.reverse());
        sb1.setLength(8);
        System.out.println("set length "+sb1);

    }
}
