package BuilderPattern;

import java.util.Date;

public final class Employee {

     private String  firstName;
     private String lastName;
     private int empNumber;
     private String designation;
     private Date joiningDate;
     private String deptName;

    private Employee(String firstName, String lastName, int empNumber, String designation, Date date, String deptName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.empNumber = empNumber;
        this.designation = designation;
        this.joiningDate = date;
        this.deptName = deptName;

    }


    public static class EmployeeBuilder {
        private String  firstName = "Ramesh";
        private String lastName = "Rao";
        private int empNumber = 2345;
        private String designation = "Developer";
        private Date joiningDate = new Date();
        private String deptName = "Technology";


        public Employee build(){

              return new Employee(firstName, lastName, empNumber, designation, joiningDate, deptName);
          }


       public EmployeeBuilder withFirstName(String firstName)
        {
            this.firstName=firstName;
            return this;
        }

        public EmployeeBuilder withLastName(String lastName)
        {
            this.lastName=lastName;
            return this;
        }

        public EmployeeBuilder withDesignation(String designation)
        {
            this.designation=designation;
            return this;
        }

        public EmployeeBuilder withJoiningDate(Date date)
        {
            this.joiningDate=date;
            return this;
        }

        public EmployeeBuilder withDepartmentName(String deptName)
        {
            this.deptName=deptName;
            return this;
        }

        public EmployeeBuilder withEmployeeNumber(int empNumber)
        {
            this.empNumber=empNumber;
            return this;
        }


    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getEmpNumber() {

        return empNumber;
    }

    public String getDesignation() {

        return designation;
    }

    public Date getJoiningDate() {

        return joiningDate;
    }

    public String getDeptName() {

        return deptName;
    }
}
