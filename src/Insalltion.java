public class Insalltion {
    public static void main(String[] args) {
        // declar and initialize and array
        // int[]arr={1,2,3,3};
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
           for(int j=i;j<5;j++){
            System.out.print("  "+arr[i][j]);
           }
           System.out.println();
        }

        // for (int i = arr.length; i > 0; i--) {
        //     System.out.print(" " + i);
        // }

    }
}
