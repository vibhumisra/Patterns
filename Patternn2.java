import java.util.*;

class Patternn2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}