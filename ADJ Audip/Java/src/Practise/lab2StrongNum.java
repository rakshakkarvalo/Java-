import java.util.Scanner;

public class lab2StrongNum {

    static void checkStrong(int num) {
        int original = num;
        int sum = 0;145
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }

        String result = (sum == original) 
                        ? original + " is a Strong Number" 
                        : original + " is NOT a Strong Number";

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkStrong(number);
        sc.close();
    }
}
