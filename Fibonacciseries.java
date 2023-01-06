import java.util.Scanner;

class FibonacciSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        
        System.out.println("Fibonacci Series till " +num+ " 56terms:");
        int n1 = 0, n2 = 1, n3;
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n1 + ",");

        }
    }

}