public class CopyOneArrayintoAnotherArray {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int[] arr1=new int[arr.length];

        arr[0]=1;
        arr[1]=2;
        arr[3]=3;


        for(int i=0; i<arr.length; i++){
            arr1[i]=arr[i];
            System.out.println(arr[i]);
        }
    }
}