import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student{
        String firstName;
        String lastName;
        int age;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        String homeTown;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scan.nextLine();

        while (!(input.equals("end"))){
            String[] line = input.split(" ");

            Student student = new Student();

            student.setFirstName(line[0]);
            student.setLastName(line[1]);
            student.setAge(Integer.parseInt(line[2]));
            student.setHomeTown(line[3]);


            students.add(student);

            input = scan.nextLine();
        }

        String city = scan.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(city)){
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}

