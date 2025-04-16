package Arrayeg;
class Employee1 
{
    // Instance variables
    int id;
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee1(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() 
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeDetails1 {
    public static void main(String[] args) {
        // Creating an array of Employee1 objects
    	
//    	Employee1 obj = new Employee1(101, "John Doe", 50000);
//    	obj.displayDetails();

    	
    	Employee1[] obj = new Employee1[3];

        // Initializing the array with Employee1 objects
        obj[0] = new Employee1(101, "John Doe", 50000);
        obj[1] = new Employee1(102, "Jane Smith", 60000);
        obj[2] = new Employee1(103, "Mike Johnson", 55000);

        // Looping through the array to display employee details
        for (int i = 0; i < obj.length; i++) {
        	obj[i].displayDetails();
        }
   }
}
