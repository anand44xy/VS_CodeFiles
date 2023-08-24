public class VariableExample {
    // Instance variable
    private int instanceVariable;

    // Static variable
    private static int staticVariable;

    public void exampleMethod() {
        // Local variable
        int localVariable = 20;
        
        System.out.println("Local variable: " + localVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();
        
        obj1.instanceVariable = 30;
        obj2.instanceVariable = 40;
        
        staticVariable = 50;
        
        obj1.exampleMethod();
        obj2.exampleMethod();
    }
}


/*
 * 
Memory map:

Stack:
When the main method is executed, space is allocated on the stack for args, obj1, and obj2.
The references to obj1 and obj2 are stored on the stack.
When obj1.exampleMethod() is called, space is allocated on the stack for localVariable of the method.
The value of localVariable (20 in this case) is stored on the stack.
Similarly, when obj2.exampleMethod() is called, another space is allocated on the stack for localVariable.
Once the method execution completes, the stack space for localVariable is freed.

Heap:
When objects obj1 and obj2 are created, memory is allocated on the heap for their instance variables.
Each object has its own separate memory space for instanceVariable.
obj1.instanceVariable is set to 30, and obj2.instanceVariable is set to 40.

Static Memory:
The staticVariable is stored in the static memory, which is common to all objects of the VariableExample class.
Since staticVariable is a static variable, its value is shared among all instances of the class.
In this example, staticVariable is set to 50
 */
 
