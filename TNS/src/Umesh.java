public class Umesh {

	public static void main(String[] args) {
		
		System.out.println("Primitive type:-Primitive data types in Java are fixed in size."
				+ "\nThey store actual values directly (e.g., int stores a number directly)"
				+ "\nThere are 8 primitive types: byte, short, int, long, float, double, char, and boolean. ");
		System.out.println("Umesh Mali"); // Umesh Mali
		
		boolean boolVal = false;  // Default value is false
		System.out.println(boolVal);  // Output will be 'false'

		// Memory size of boolean: 1 bit (usually stored in 1 byte)

		byte byteMax=127; 
		byte byteMin=-128;
		System.out.println("min range of byte" + byteMin); // min range of byte-128
		System.out.println("max range of byte" + byteMax); // max range of byte127
		// Memory size of byte: 1 byte (8 bits)

		char chr=65;
		System.out.println(chr); // 65 (ASCII value of 'A')  
		// Memory size of char: 2 bytes (16 bits)

		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short" + shortMin); // min range of short-32768
		System.out.println("max range of short" + shortMax); // max range of short32767
		// Memory size of short: 2 bytes (16 bits)

		int intMax=2147483647;
		int intMin=-2147483648;
		System.out.println("min range of int" + intMin); // min range of int-2147483648
		System.out.println("max range of int" + intMax); // max range of int2147483647
		// Memory size of int: 4 bytes (32 bits)

		float floatVal=3.14f;
		System.out.println(floatVal); // 3.14
		// Memory size of float: 4 bytes (32 bits)

		long longMax=9223372036854775807L;
		long longMin=-9223372036854775808L;
		System.out.println("min range of long" + longMin); // min range of long-9223372036854775808
		System.out.println("max range of long" + longMax); // max range of long9223372036854775807
		// Memory size of long: 8 bytes (64 bits)

		double doubleVal=3.14159;
		System.out.println(doubleVal); // 3.14159
		// Memory size of double: 8 bytes (64 bits)
		System.out.println("min range of double: " + Double.MIN_VALUE); // min range of double: 4.9e-324
		System.out.println("max range of double: " + Double.MAX_VALUE); // max range of double: 1.7976931348623157e+308
	
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Non-primitive type:-\r\n"
				+ "store the memory address/reference "
				+ "\nwhere the actual data is located and their memory size depends on the object.\nThe default value for non-primitive types is null, indicate no object reference, "
				+ "\nand ex Classes, Interfaces, Arrays, and Enums");
		
		System.out.println();
		
		// String (Non-primitive type)
		String str = "Hello, Kiran!";
		System.out.println(str); // Hello, Umesh!
		// Memory size of String: Depends on the length of the string and JVM,
		// but each character takes 2 bytes (UTF-16)

		// Array (Non-primitive type)
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.print("Array values: ");
		for(int num : numbers) {
		  System.out.print(num + " "); // 1 2 3 4 5
		 }
		System.out.println();
		// Memory size of array: Depends on the number of elements and their data type. 
		//For example, int[] (4 bytes per element)
	
	}
}
