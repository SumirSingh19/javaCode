// File: ComplexClassScenarios.java
import java.util.*;
// A simple class definition
public class test {
    // This is a simple class
    private String className = "class InAString"; // The word 'class' here should not be counted

    public void printClassInfo() {
        // The word 'class' in this comment should not be counted
        System.out.println("This is the ComplexClassScenarios class.");
    }

    /*
     * The word 'class' in this block comment
     * should not be counted.
     */

    // An inner class definition
    class InnerClass {
        // Inner class implementation
    }

    // A static nested class definition
    static class StaticNestedClass {
        // Static nested class implementation
    }

    public static void main(String[] args) {
        System.out.println("This program counts the number of class definitions.");
    }
}

// A non-public class definition
class AnotherClass {
    // Another class implementation
}