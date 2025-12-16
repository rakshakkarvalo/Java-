class Printer {
    void printDetails(String name, int age) {
        System.out.println("Method 1 called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    void printDetails(int age, String name) {
        System.out.println("Method 2 called");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Printer p = new Printer();
        p.printDetails("Rahul", 22);

        System.out.println("------------");
        p.printDetails(25, "Amit");
    }
}