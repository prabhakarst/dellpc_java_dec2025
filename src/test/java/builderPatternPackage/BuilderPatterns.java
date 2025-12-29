package builderPatternPackage;

public class BuilderPatterns {
    public static void main(String[] args) {
        BankingSite emp1=new BankingSite();
        emp1.login()
            .entry();

        BankingSite emp2=new BankingSite();
                emp2.entry()
                        .un("admin");

    }
}
