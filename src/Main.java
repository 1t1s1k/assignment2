import java.util.ArrayList;

interface Payable {
    double getPaymentAmount();

}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Making Persons(Students and Employee)
        Student student1 = new Student("Ibragim", "Kuandykov", 1.0);
        Student student2 = new Student("Leonel", "Messi", 4.0);

        Employee employee1 = new Employee("Ishow", "Speed", 270045.78);
        Employee employee2 = new Employee("Kai", "Senat", 350000.07);


        // Adding students an employee to
        persons.add(employee1);
        persons.add(employee2);
        persons.add(student1);
        persons.add(student2);

        printData(persons);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }

}