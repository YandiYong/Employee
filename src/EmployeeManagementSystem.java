import java.util.ArrayList;

public class EmployeeManagementSystem {

    private ArrayList<Employee> employees;

    //Constructor to initialize my attributes
    EmployeeManagementSystem(){
        employees = new ArrayList<>();
    }

    //This is my setter
    public void setEmployee(Employee emp){
        employees.add(emp);
    }

    public String getEmployeeInfo(){
        for (int i = 0; i < employees.size(); i++){
              return  employees.indexOf(i);
        }
    }


}
