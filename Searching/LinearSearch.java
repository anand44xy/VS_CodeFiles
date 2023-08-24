package Searching;
class LinearSearch{
    public static void main(String[] args){
       int arr[]={3,5,2,6,7};
       int target=3;

       int flag=0;
       for(int i=0; i<arr.length; i++){
          if (target==arr[i]) {
            System.out.println("Target is found in tha given Array.");
            flag=1;
            break;
          }
       }
       if (flag==0) {
        System.out.println("Target is not found in the given array.");
       }
    }
}

