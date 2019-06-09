public class Person {

    private String firstName, lastName, pesel;
    private int age;

    public Person(String firstName, String lastName, int age, String pesel) {
        if (null == firstName || null == lastName || firstName.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException();
        }

        if (age < 1) {
            throw new IncorrectAgeException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
