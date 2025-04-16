package Typesiofvariable;
public class Global
{
	    // Global (or instance) variable
	    private int globalVariable = 10;

	    public static void main(String[] args) {
	        // Create an instance of the class
	        Global example = new Global();

	        // Call the method that demonstrates local and global variables
	        example.demonstrateVariables();
	    }

	    public void demonstrateVariables() {
	        // Local variable
	        int localVariable = 5;

	        // Accessing the global variable
	        System.out.println("Global variable: " + globalVariable);

	        // Accessing the local variable
	        System.out.println("Local variable: " + localVariable);

	        // Modifying the global variable
	        globalVariable += 5;

	        // Modifying the local variable (this won't affect other methods)
	        localVariable += 10;

	        System.out.println("Modified global variable: " + globalVariable);
	        System.out.println("Modified local variable: " + localVariable);
	    }

	    //

}
