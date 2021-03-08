package Sort_By_Name_And_Age;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + ' ' + lastName + " is " + age + " years old.";
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
