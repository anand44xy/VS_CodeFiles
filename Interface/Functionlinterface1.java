@FunctionalInterface
interface Demo{
    void disp();
}


public class Functionlinterface1 {
    public static void main(String[] args) {
        Demo d=new Demo() {
            public void disp(){
                System.out.println("Beta implemnetation");
            }
        };
        d.disp();
    }
}
