public class StudentGrade {
    public static void main(String[] args) {
        int marks =34;

        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: Distinction");
        } 
        else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: Distinction");
        } 
        else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: First Class");
        } 
        else if (marks >= 41 && marks <= 60) {
            System.out.println("Grade: Second Class");
        } 
        else if (marks >= 35 && marks <= 40) {
            System.out.println("Grade: Pass");
        } 
        else if (marks >= 0 && marks <= 34) {
            System.out.println("Grade: Fail");
        } 
        else {
            System.out.println("Invalid marks! Enter 0–100.");
        }

      
    }
}
