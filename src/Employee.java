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