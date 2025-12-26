package packageOne;
class students1{
    char grade;
    String name;
    public void display(){
        System.out.println("name"+name);
        System.out.println("grade "+grade);
        System.out.println("******************************");
    }
}
public class O5ObjectReassigment {
    public static void main(String[] args) {
students1 s2=new students1();
s2.name="Durgesh";
s2.grade='B';
s2.display();

students1 s3=new students1();
s3.name="Arjun";
s3.grade='A';
s3.display();


System.out.println(s2==s3);

s2=s3;

s2.display();


    }
}
