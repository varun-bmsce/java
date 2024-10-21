import java.util.*;

class TypeCast{
	public static void main(String args[]){
		byte b;
		int i = 257;
		double d = 323.142;
		char c = 'a';

		System.out.println("Conversion of int to byte");
		System.out.println("Value of int before conversion to byte: "+i);
		b = (byte)i;
		System.out.println("Value of int after conversion to byte: "+b);

		System.out.println("\nConversion of double to int");
		System.out.println("Value of double before conversion to int: "+d);
		i = (int)d;
		System.out.println("Value of double after conversion to int: "+i);

		System.out.println("\nConversion of double to byte");
		System.out.println("Value of double before conversion to byte: "+d);
		b = (byte)d;
		System.out.println("Value of double after conversion to byte: "+b);

		System.out.println("\nConversion of char to int");
		System.out.println("Value of char before conversion to int: "+c);
		i = (int)c;
		System.out.println("Value of char after conversion to int: "+i);



	}
}