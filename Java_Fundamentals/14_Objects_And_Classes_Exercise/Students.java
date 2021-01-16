import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student{
        String firstName;
        String lastName;
        Double grade;

        public Student(String firstName, String lastName, Double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentId = scan.nextLine().split(" ");
            Student student = new Student(studentId[0], studentId[1], Double.parseDouble(studentId[2]));
            studentList.add(student);
        }

        studentList.sort((Student s1, Student s2) -> s2.getGrade().compareTo(s1.getGrade()));

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}

