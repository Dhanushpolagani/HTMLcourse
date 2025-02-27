import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int p = 0; p < t; p++) {
            int n = scanner.nextInt();
            System.out.println("Case #" + (p + 1) + ":");
            
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= 1; j--) {
                    if (i >= j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
