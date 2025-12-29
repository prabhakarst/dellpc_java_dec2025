package builderPatternPackage;


public class BankingSite {

    public BankingSite login(){
        System.out.println("login");
        return new BankingSite();
    }
    public BankingSite entry(){
        System.out.println("entry");
        return new BankingSite();
    }
public  BankingSite un(String ad){
    System.out.println(ad);
        return new BankingSite();
}

}
