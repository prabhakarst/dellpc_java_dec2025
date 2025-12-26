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

int c=10;
boolean d=false;
do{
    if(c>90) {
        System.out.println("greater");
        d = true;
    }
    else if(c!=10) {
        System.out.println("NE");
        d = true;
    }
    else{
        System.out.println("values not matched in loop");
        d = true;
        break;
    }
}
while(d);

int i;
for (i=0;i<10;i++){
    if(i==5){
        continue;
    }
    else{
        System.out.println(i);
    }

}
String s;
int index_pos=0;
for(s="Hello";s.length()<=10;s=s+"!"){
    System.out.println(s);


        }

        System.out.println(s.substring(1,4));
}
}