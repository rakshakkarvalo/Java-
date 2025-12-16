public class HousePattern {
    public static void main(String[] args) {

        int rows = 8;
        int cols = 7;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {

                if (r == 1 && c == 4)
                    System.out.print("* ");

                else if (r == 2 && (c == 3 || c == 5))
                    System.out.print("* ");

                else if (r == 3 && (c == 2 || c == 6))
                    System.out.print("* ");

                else if (r == 4)
                    System.out.print("* ");

                else if (r == 5 && (c == 2 || c == 6))
                    System.out.print("* ");

                else if (r == 6 && (c == 2 || c == 6))
                    System.out.print("* ");

                else if (r == 7 && (c == 2 || c == 6))
                    System.out.print("* ");

                else if (r == 8 && (c >= 2 && c <= 6))
                    System.out.print("* ");

                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
