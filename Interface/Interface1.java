interface CLS{
    int getLength(String s);
    void disp();
}
public class Interface1 {
    public static void main(String[] args) {
        CLS c=new CLS() {

            public int getLength(String s){
            int reslt=s.length();
            return reslt;
            }

            public void disp(){

            }
        };
        System.out.println(c.getLength("Anand"));
    }
}