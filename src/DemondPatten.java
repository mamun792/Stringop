public class DemondPatten {
    public static void main(String[] args) {
        // int[][] arr = new int[5][5];

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5-i; j++) {
              System.out.print(" ");
            }

            for(int c=1;c<=2*i-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5 - 1; i >= 1; i--) {
            // Print spaces before stars
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
