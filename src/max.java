import java.util.Arrays;

public class max {

    public static int Max(int n, int[] arr) {

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 1, 4, 5, 8, 9 };
        int n = arr.length;
        System.out.println(n);
        int m = Max(n, arr);
        System.out.println("Max: " + m);
        Arrays.sort(arr); 
      System.out.println(Arrays.toString(arr));

      int [] copy=Arrays.copyOf(arr, n);
      System.out.println(Arrays.toString(copy));

      int index = Arrays.binarySearch(arr, 8);
      System.out.println("Index of 7: " + index);
    }

}
