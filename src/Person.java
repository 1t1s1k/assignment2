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