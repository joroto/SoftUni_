import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Students2 {
    private static boolean DoesStudentExist(List<Student> students, String FirstName, String LastName){
        for (Student student : students) {
            if (student.getFirstName().equals(FirstName) && student.getLastName().equals(LastName)){
                return true;
            }
        }
        return false;
    }

    public static class Student{
        String firstName;
        String lastName;
        int age;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

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

    private static Student getStudent (List<Student> students, String firstName, String lastName){
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scan.nextLine();

        while (!(input.equals("end"))){
            String[] line = input.split(" ");

            String firstName = line[0];
            String lastName = line[1];
            String age = line[2];
            String homeTown = line[3];

            if (DoesStudentExist(students, firstName, lastName)){
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(Integer.parseInt(age));
                student.setHomeTown(homeTown);

            }else {
                Student student = new Student(firstName, lastName, Integer.parseInt(age), homeTown);
                students.add(student);
            }
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
