package Salary_Increase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        if(age < 30){
            setSalary(salary + salary * percent / 200);
        }else {
            setSalary(salary + salary * percent / 100);
        }
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + " gets " + salary + " leva";
    }

}
