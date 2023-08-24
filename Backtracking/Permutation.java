package Backtracking;

import java.util.Arrays;

public class Permutation {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i); // Backtrack to restore the original order
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        permute(array, 0, array.length - 1);
    }
}
