package Typesiofvariable;
//the global or static variable and the instance variable can be acessed 
//throughout the class, but local variable can only be accessed within its method.
public class Instancevar {
    
    // Global variable (also called static variable)
    static String globalVar = "I am a global variable";
    
    // Instance variable
    String instanceVar = "I am an instance variable";
    
    public void showVariables() {
        // Local variable
        String localVar = "I am a local variable";
        
        // Accessing all types of variables
        System.out.println(localVar);           // Local variable
        System.out.println(instanceVar);        // Instance variable
        System.out.println(globalVar);          // Global variable
    }
    
    public static void main(String[] args) {
        // Create an object to access the instance method
        Instancevar example = new Instancevar();
        example.showVariables();
        
        // Accessing global variable directly without object creation
        System.out.println(Instancevar.globalVar);
    }
}
