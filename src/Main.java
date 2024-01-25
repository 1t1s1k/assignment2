import java.util.ArrayList;

interface Payable {
    double getPaymentAmount();

}

class Person implements Payable, Comparable<Person> {

    private static int id = 0;

    public Person() {
        this.id = id;
    }

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        this.id = ++id;
        return id + " " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}

class Employee extends Person {
    private String position;
    private double salary;


    public Employee() {
        super();
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}
//Making student child class which
class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    // condition for Student earnings
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return  36660.00;
        } else {
            return 0;
        }
    }
    // I made this to make output as in tamplate
    // this will output our id name and surname in future
    @Override
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
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




