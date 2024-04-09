import java.util.Scanner; //Package for userInput
import java.util.ArrayList;//Package for ArrayList

public class Main {
    public static void main(String[] args) {
        //This is used to allow a user to enter inputs.
        Scanner myInput = new Scanner(System.in);
    Employee emp = new Employee();
     emp.setEmpNo(30);
     emp.setFirstname("Yandiswa");
     emp.setLastname("Ndarane");
    System.out.println("Enter your name: ");

    String userName = myInput.nextLine();
        System.out.println(userName);


    }
}