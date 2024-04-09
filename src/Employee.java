public class Employee {

     String firstname;
     String lastname;
     double salary;
     int empNo;

    //These are constructors that initializes my object one with parameters and other without
    Employee(){}
    //To set my attributes
    public void setEmpNo(int empNo){
        this.empNo =empNo;
    }
    public void setFirstname(String firstname){
        this.firstname =firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    //To get data from a database
    public int getEmpNo(){
         return empNo;
    }
    public double getSalary(){
        return salary;
    }
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    Employee(int empNum, String firstName, String lastName, double salary1){

        this.empNo = empNum;
        this.firstname = firstName;
        this.lastname = lastName;
        this.salary = salary1;

    }


}
