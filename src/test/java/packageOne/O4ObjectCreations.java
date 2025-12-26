package packageOne;

//we can have multiple classes but can have only one main class
//stack is mainly focussed on variable declaration
//stack:actual program execution happens

//heap is mainly focussed on object management
//heap makes a xerox/photocopy of all variables or methods that's present inside a class

class Students {
    int marks;
    String name;
    char grade;
}
class teachers
{
    String t_name;
    String t_add;
    int t_age;
    public void display(){
        System.out.println("name of teacher is "+t_name);
        System.out.println("age of teacher is "+t_age);
        System.out.println("address of teacher "+ t_add);
        System.out.println("******************************");
    }

}
public class O4ObjectCreations {
    public static void main(String[] args) {

        Students s2= new Students();
     s2.name="Prab";
        System.out.println("name is "+s2.name);
     s2.grade='A';
        System.out.println("grade is "+s2.grade);
//use method to print
       teachers s3=new teachers();
       s3.t_name="Rahul";
       s3.t_age=34;
       s3.t_add="Blr";
        s3.display();

        s3.t_name="teach2";
                s3.t_age=70;
        s3.t_add="Belgaum";
        s3.display();;

        




    }
}
