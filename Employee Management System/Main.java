

import java.util.Scanner;

public class Main{

static Employeeservice Empservice=new Employeeservice();
    static boolean ordering=true;
    public static void menu(){
    System.out.println("********  Welcome To Employee Management System  ********"
    +"\n 1. Add Employee"
    +"\n 2.View Employee"
    +"\n 3.Update Employee"
    +"\n 4.Delete Employee"
    +"\n 5.View All Employee"
    +"\n 6. Exist");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        Employeeservice service=new Employeeservice();
        do{
            menu();
            System.out.println("Enter your Choice:");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Add Employee");
                    service.addemp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewemp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmp();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteemp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewAllEmps();                   
                    break;
                case 6:
                    System.out.println("Thank you for using application!!");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Please Enter valid choice");
                    break;
            }
        }
        while(ordering);
       s.close();
    }
}