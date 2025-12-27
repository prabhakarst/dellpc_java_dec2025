package packageOne;
class cars {
    //instance variable: declared at class level
    static String brand;
    double price_default;
    String model_default;

    //default constructor
    public cars() {
        price_default = 3000000;
        model_default = "Tucson";
    }

    public cars(int price_para, String model_para)
    {
        //local variable: declared at method level
        price_default = price_para;
        model_default = model_para;
    }

    public void display_car_details() {
        System.out.println(price_default);
        System.out.println(model_default);
        System.out.println(brand);
        System.out.println("********************************");
    }
}
public class O12ParameterizedConstructor {
        public static void main(String[] args) {

        //default constructor
cars c3=new cars();
cars.brand="Hyundai";
        c3.display_car_details();

        //param constructor
        cars c4=new cars(900000, "Grand i10");
        c4.display_car_details();
        cars c5=new cars(1800000,"Creta");
            c5.display_car_details();
    }

}
