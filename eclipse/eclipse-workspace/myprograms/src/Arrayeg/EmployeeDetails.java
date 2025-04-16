package Arrayeg;
class Employee {
    String name;
    int id;
    String department;
    double salary;
    Employee(String name, int id, String department, double salary) 
    {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        
        employees[0] = new Employee("John Doe", 101, "HR", 50000.0);
        employees[1] = new Employee("Jane Smith", 102, "Finance", 60000.0);
        employees[2] = new Employee("Michael Brown", 103, "IT", 70000.0);
        employees[3] = new Employee("Emily Davis", 104, "Marketing", 55000.0);
        employees[4] = new Employee("David Wilson", 105, "Sales", 45000.0);

        for (int i = 0; i < employees.length; i++) 
        {
            employees[i].displayDetails();
        }
    }
}
