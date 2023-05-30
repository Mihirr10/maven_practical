package com.employeemanagement;

import com.employeemanagement.emploeeimplement.EmployeeDaoImplement;
import com.employeemanagement.emploeeinterface.EmployeeDaoInterface;
import com.employeemanagement.employee.Employee;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    String name;
    int id;
    EmployeeDaoInterface dao = new EmployeeDaoImplement();
    System.out.println("Employee management application");

    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("1. Add Employee\n" + "2. Show All Employee\n" + "3. Show Employee based on id \n" + "4. Update the employee\n" + "5. Delete the employee\n");

      System.out.println("Enter Choice: ");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          Employee emp = new Employee();
          System.out.println("Enter ID : ");
          id = sc.nextInt();
          System.out.println("Enter name ");
          name = sc.next();
      
          System.out.println("Enter Salary ");
          float salary = sc.nextFloat();
          System.out.println("Enter age");
          int age = sc.nextInt();

          emp.setId(id);
          emp.setName(name);
          emp.setSalary(salary);
          emp.setAge(age);
          dao.createEmployee(emp);
          break;
        case 2:
          dao.showAllEmployee();
          break;
        case 3:
          System.out.println("Enter id to show the details ");
          int empid = sc.nextInt();
          dao.showEmployeeBasedOnID(empid);
          break;
        case 4:
          System.out.println("Enter id to update the details");
          int empid1 = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter the new name");
          name = sc.nextLine();
          dao.updateEmployee(empid1, name);
          break;
        case 5:
          System.out.println("Enter the id to delete");
          id = sc.nextInt();
          dao.deleteEmployee(id);
          break;

        case 6:
          System.out.println("Thank you for using our Application !!!");
          System.exit(0);
        default:
          System.out.println("Enter valid choice !");
          break;


      }

    } while (true);

  }
}
