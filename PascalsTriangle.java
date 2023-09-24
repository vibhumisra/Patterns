import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
    
            int k = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(k + " ");
                k = k * (line - i) / i;
            }
    
            System.out.println();
        }
    

    }  
    
}
