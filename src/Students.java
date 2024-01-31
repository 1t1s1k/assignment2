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