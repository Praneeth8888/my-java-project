public class Hello21 {
    public static void main(String[] args) {

        // -------- Primitive Data Types --------
        byte b = 100;                 // 1 byte
        short s = 30000;              // 2 bytes
        int i = 100_000;              // 4 bytes
        long l = 10_000_000_000L;     // 8 bytes

        float f = 3.14f;              // 4 bytes
        double d = 3.14159265359;     // 8 bytes

        char c = 'A';                 // 2 bytes in Java (UTF-16 code unit)
        boolean flag = true;          // logical value: true or false

        // -------- Reference Types / Objects --------
        String str = "Hello, Java"; // String object
        int[] arr = {1, 2, 3, 4, 5}; // Array object
        Integer wrapperInt = Integer.valueOf(50); // Wrapper class example
        StringBuilder sb = new StringBuilder("Java"); // Mutable string builder
        String emptyName = null; // Reference type can be null

        // -------- Type Casting Example --------
        int castedDouble = (int) d; // convert double to int by removing decimal part

        // -------- Output --------
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.println("Double to int cast: " + castedDouble);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);
        System.out.println("Null reference example: " + emptyName);
    }
}