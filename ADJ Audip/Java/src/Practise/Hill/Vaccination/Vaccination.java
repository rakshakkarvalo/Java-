abstract class Vaccine {

    int age;
    String nationality;
    boolean firstDoseTaken = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            firstDoseTaken = true;
            System.out.println("First dose taken successfully");
            System.out.println("Please pay Rs.250");
        } else {
            System.out.println("You are not eligible for the first dose");
        }
    }

    void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Second dose taken successfully");
        } else {
            System.out.println("First dose is mandatory before second dose");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Booster dose administered successfully");
        System.out.println("Vaccination completed");
    }
}

public class Vaccination {

    public static void main(String[] args) {

        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}