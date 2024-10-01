/*
   Write a program by creating an 'Employee' class having the following methods and print the final salary.
  a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
  b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
  c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per
      day is more than 6 hours.
 */
public class Employee {
    private int empId;
    private String name;
    private double salary;
    private int hoursPerDay;

    Employee(){
        empId=0;
        name=null;
        salary=0.0;
        hoursPerDay=0;
    }

    Employee(int empId,String name,double salary,int hoursPerDay){
       this.empId=empId;
       this.name=name;
       this.salary=salary;
       this.hoursPerDay=hoursPerDay;
    }
    // Employee information
   public void getInfo(){
        System.out.println("Employee Id : "+empId+"  EmployeeName : "+name+"  Salary  =$"+salary);
   }

    // adding the $10 to salary if it is less than $500
    public void AddSalary() {
        if (salary < 500) {
            salary =salary+ 10;
        }
    }

    //  adding $5 to salary if hours of work per day are more than 6
    public void AddingWork() {
        if (hoursPerDay > 6) {
            salary =salary + 5;
        }
    }

    // increamenting the salary
          // employee1.display();

    public void display(){
        System.out.println("Employee id : "+empId);
        System.out.println("Name : "+name);
        System.out.println("Salary : $"+salary);
    }
}
