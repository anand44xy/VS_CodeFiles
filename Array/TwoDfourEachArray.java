public class TwoDfourEachArray {
    public static void main(String[] args) {
        // 1D for-each 

        // int arr[]={2,3,4,5};
        // for(int element:arr){
        //     System.out.println(element);
        // }

        // 2D for-each
        int arr[][]={{11,12,13},{14,15,16}};
        for(int ar[]:arr){
            for(int element:ar){
                System.out.println(element);
            }
        }

    }
}
