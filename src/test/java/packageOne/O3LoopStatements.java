package packageOne;

public class O3LoopStatements {
    public static void main(String[] args) {
        int b = 40;
        while (b < 60){
            System.out.println(b);
        b += 1;
    }
//String hello="     random";
//        System.out.println(hello.stripLeading());

        //eg:1
 int do_while=23-3;
do{
    System.out.println("print atleast once "+do_while);
}
while (do_while%2!=0);

//eg:2
        int a=12-532;
        do{
            System.out.println("goes to infinite if I dont give break because the condition keeps staisfying");
        break;
        }
        while(a%2==0);


    //eg:3
    int cds=900;
    do{
        System.out.println(cds);
    }
while (cds<400);
}
}