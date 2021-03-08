package First_And_Reserve_Team;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    // FIXME: 01/03/2021 java.lang.AssertionError: Wrong salary is set 81/100

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent){
        if(age <= 30){
            setSalary(salary + salary * percent / 200);
        }else {
            setSalary(salary + salary * percent / 100);
        }
    }

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + " gets " + salary + " leva";
    }

    public void setFirstName(String firstName) {
        if(firstName.length() >= 3) {
            this.firstName = firstName;
        }else {
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
    }

    public void setLastName(String lastName) {
        if(lastName.length() >= 3) {
            this.lastName = lastName;
        }else {
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }else {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
    }

    public void setSalary(double salary) {
        if(salary >= 460){
            this.salary = salary;
        }else {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}