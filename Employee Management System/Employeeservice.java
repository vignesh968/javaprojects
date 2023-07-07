

import java.util.*;

public class Employeeservice {
    
    HashSet<Employee> empset=new HashSet<Employee>();
    Employee emp1=new Employee(101,"VICKY",24,"JAVA DEVELOPER","IT",45000);
    Employee emp2=new Employee(102,"VIJAY",24,"PYTHON DEVELOPER","IT",50000);
    Employee emp3=new Employee(103,"HARI",24,"JAVA DEVELOPER","IT",45000);
    Employee emp4=new Employee(104,"CEB",23,"WEB DEVELOPER","IT",60000);

    Scanner s=new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double salary;
    public Employeeservice(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }
    //view all employees
    public  void viewAllEmps()
    {
        for(Employee em:empset)
        {
            System.out.println(em);
        }
    }

    // view employee based on ID
    public void viewemp()
{
  
System.out.println("Enter your Id");
int id=s.nextInt();
for(Employee em:empset)
{
    if(em.getId()==id){
        System.out.println(em);
        found=true;
    }
}
if(found==false)
{
    System.out.println("Employee Id Not Prersent");
}
}

//update employee
public void updateEmp()
{
    System.out.println("Enter Your ID");
    int id=s.nextInt();
    for(Employee em:empset)
    {
        if(em.getId()==id)
        {  
            System.out.println("Enter your Name");
             name=s.next();
            System.out.println("Enter your Salary");
             salary=s.nextDouble();
            em.setName(name); 
            em.setSalary(salary); 
            System.out.println("Updated Details of Employees"); 
            System.out.println(em); 
            found=true;
        }
    }
    if(found==false)
{
    System.out.println("Employee Id Not Prersent");
}
else{
    System.out.println("Employees details updated successfully");
}
}
//delete employees
public void deleteemp()
{
    System.out.println("Enter your Id");
     id=s.nextInt();
     Employee emdele=null;
     for(Employee em:empset)
     {
        if(em.getId()==id)
        {
            emdele=em;  
            found=true;                        
        }
     }
     if(found==false)
     {
         System.out.println("Employee Id Not Prersent");
     }
     else{
        empset.remove(emdele);
         System.out.println("Employees details deleted successfully");
     }
}
// add employee details
public void addemp()
{
    System.out.println("enter your id ");
    id=s.nextInt();
    System.out.println("enter your name");
    name=s.next();
    System.out.println("enter age");
    age=s.nextInt();
    System.out.println("Enter desiganation");
    desiganation=s.next();
    System.out.println("Enter department");
    department=s.next();
    System.out.println("Enter salary");
    salary=s.nextDouble();
    Employee emp = new Employee(id,name,age,desiganation,department,salary);
    empset.add(emp);
    System.out.println(emp);
    System.out.println("New Employee Add successfully");
}
}
