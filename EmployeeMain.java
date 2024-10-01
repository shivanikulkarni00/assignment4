public class EmployeeMain {
    public static void main(String[] args) {


        System.out.println("___________________First object___________________________________");
        Employee employee = new Employee();
        employee.getInfo();
       // employee.display();

        employee.AddSalary();
        employee.AddingWork();
        //employee.printSalary();
       employee.display();


       System.out.println("______________________Second Object___________________________________");
        Employee employee1=new Employee(1,"Adi",100000.00,8);
        employee1.getInfo();
       // employee1.display();

        employee1.AddSalary();
        employee1.AddingWork();
        //employee1.printSalary();
        employee1.display();

    }
}
/*
___________________First object___________________________________
Employee Id : 0  EmployeeName : null  Salary  =$0.0
Employee id : 0
Name : null
Salary : $10.0
______________________Second Object___________________________________
Employee Id : 1  EmployeeName : Adi  Salary  =$100000.0
Employee id : 1
Name : Adi
Salary : $100005.0

 */