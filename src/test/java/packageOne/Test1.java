package packageOne;
class cars_check{
    int engine_cap;
    String brand;
    static int tyre;


        public cars_check(int engine_cap,String brand) {
            this.engine_cap = engine_cap;
            this.brand=brand;
        }
        public void display_features(){
        System.out.println(engine_cap);
        System.out.println(brand);
        System.out.println(tyre);

    }
    public void setUpdate(int engine_cap){
            this.engine_cap=engine_cap;
    }
    public int getUpdate(){
            return engine_cap;
    }
        }
public class Test1 {
    public static void main(String[] args) {
int ck=1;
        System.out.println(ck);
          int pt=1;
        System.out.println(pt);


    cars_check.tyre=4;
    cars_check cc=new cars_check(800,"Hyundai");
    cc.display_features();
    cc.setUpdate(1000);
    cc.display_features();

}
}