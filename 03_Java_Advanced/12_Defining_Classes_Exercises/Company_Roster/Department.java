package Company_Roster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private List<Employee> employeeList;

    public Department() {
      this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public double getAverageSalary(){
        double avgSal = 0;
        for (Employee employee : this.employeeList) {
            avgSal += employee.getSalary();
        }
        return avgSal / this.employeeList.size();
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }
}
