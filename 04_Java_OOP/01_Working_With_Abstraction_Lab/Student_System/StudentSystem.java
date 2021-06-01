package Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> database;

    public StudentSystem() {
        this.database = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.database;
    }

    public void ParseCommand(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        if (args[0].equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            CreateStudent(name, age, grade);
        } else if (args[0].equals("Show")) {
            String name = args[1];
            PrintStudent(name);
        }
    }

    private void PrintStudent(String name) {
        if (database.containsKey(name)) {
            Student student = database.get(name);
            PrintStudent(student);
        }
    }

    private void PrintStudent(Student student) {
        String view = String.format("%s is %s years old.", student.getName(), student.getAge());
        System.out.println(PrintMessage(student, view));
    }

    private String PrintMessage(Student student, String view) {
        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }
        return view;
    }

    private void CreateStudent(String name, int age, double grade) {
        if (!database.containsKey(name)) {
            Student student = new Student(name, age, grade);
            database.put(name, student);
        }
    }
}
