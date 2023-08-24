public class CheckAnyCharcterInString {
    public static void main(String[] args) {
        // here we are check any charcter in string is it presnt or not in given string
        String str="Anand";
        char testCase='a';
        boolean isPresent=true;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==testCase){
                isPresent=true;
                break;
            }
        }
        if(isPresent){
            System.out.println("Given character is presint in the string");
        }
        else{
            System.out.println("Given character is not presnt in the string");
        }
    }
}
