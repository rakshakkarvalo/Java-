import java.util.Scanner;

public class StudentAge3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3D Array: [branch][batch][student]
        int[][][] age = new int[2][2][5];

        // Input ages
        for (int branch = 0; branch < 2; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");

            for (int batch = 0; batch < 2; batch++) {
                System.out.println("  Batch " + (batch + 1) + ":");

                for (int student = 0; student < 5; student++) {
                    System.out.print("    Enter age of Student " + (student + 1) + ": ");
                    age[branch][batch][student] = sc.nextInt();
                }
            }
        }

        System.out.println("\n----- Stored Ages -----");

        // Display Ages
        for (int branch = 0; branch < 2; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");

            for (int batch = 0; batch < 2; batch++) {
                System.out.print("  Batch " + (batch + 1) + ": ");

                for (int student = 0; student < 5; student++) {
                    System.out.print(age[branch][batch][student] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
   System.out 