package packageOne;

public class O16Switch {
    public static void main(String[] args) {
        int a=20;
        switch(a%7)
        {
            case 1:
                System.out.println("remainder is not zero ");
            case 2:
                System.out.println("remainder is six");
            default:
                System.out.println("remainder is not mentioned here");
        }
    }
}
