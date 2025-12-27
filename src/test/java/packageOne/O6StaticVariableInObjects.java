package packageOne;
class studentsInstitutionName{
    String name;

    //static variable
    static String institution_name;
    public void display(){
        System.out.println("student name "+name);
        System.out.println("institution name "+institution_name);
        System.out.println("********************************");
    }
}


public class O6StaticVariableInObjects {

    public static void main(String[] args) {
studentsInstitutionName s4=new studentsInstitutionName();
s4.name="Krishna";
studentsInstitutionName.institution_name="Kurukshethra";
s4.display();
studentsInstitutionName s5=new studentsInstitutionName();
s5.name="Arjun";
s5.display();
    }
}