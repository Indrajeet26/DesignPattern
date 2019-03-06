package test;

import BuilderPattern.Employee;

import java.util.Date;

public class EmployeeTest {

    public static void main(String args[]) {

        Employee employee = getDetailsOfEmployee();
        System.out.println("Full Name of Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Department of Employee: " + employee.getDeptName());
        System.out.println("Designation of Employee: " + employee.getDesignation());
        System.out.println("Employee Number of Employee: " + employee.getEmpNumber());
        System.out.println("Joining Date of Employee: " + employee.getJoiningDate());
    }

    public static Employee getDetailsOfEmployee() {
        Employee builtEmployee = new Employee.EmployeeBuilder()
                .withFirstName("John")
                .withLastName("Lehman")
                .withDesignation("Coach")
                .withDepartmentName("Sports")
                .withJoiningDate(new Date())
                .withEmployeeNumber(234976)
                .build();

        return builtEmployee;

    }
}
