package abstractionclassPackage;

public class O3AutoProperties extends O2Auto {
    @Override
    void tyre(){
        System.out.println("auto tyre : 3");
    }

    @Override
    void color(){
        System.out.println("auto color: red");
    }
    @Override
    void gear(){
        System.out.println("auto gear: 4");
    }

    @Override
    void seaterCap() {
        System.out.println("auto seat cap: 3");
    }
    @Override
    void horn(){
        System.out.println("auto horn:MEDIUM");
    }
}
