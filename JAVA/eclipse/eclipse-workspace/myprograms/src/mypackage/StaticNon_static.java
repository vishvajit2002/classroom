package mypackage;
public class StaticNon_static
{
    // Static variable
    static int staticVar = 100;

    // Instance variable
    int instanceVar = 200;

    // Static method
    public static void staticMethod() {
        System.out.println("Static Var: " + staticVar); // Can access staticVar directly
        // System.out.println("Instance Var: " + instanceVar); // Error: Cannot access instanceVar directly
    }

    // Non-static method or concrete
    public void nonStaticMethod() {
        System.out.println("Static Var: " + staticVar); // Can access staticVar directly
        System.out.println("Instance Var: " + instanceVar); // Can access instanceVar directly
    }

    public static void main(String[] args) {
        Example example = new Example();

        // Accessing variables within the class
        Example.staticMethod(); // Access staticVar
        example.nonStaticMethod(); // Access both staticVar and instanceVar

        // Accessing from another class
        System.out.println(Example.staticVar); // Access staticVar via class name

        System.out.println(example.instanceVar); // Access instanceVar via instance
    }
}


