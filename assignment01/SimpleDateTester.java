package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate object1 = SimpleDate.of(1999,3,12);
		SimpleDate object2 = SimpleDate.of(2001,4,3);
		SimpleDate object3 = SimpleDate.of(2001,6,11);
		SimpleDate object4 = SimpleDate.of(2001,4,9);

		System.out.println(object1.before(object2));
		System.out.println("ABOVE SHOULD PRINT TRUE");
		System.out.println(object1.before(object3));
		System.out.println("ABOVE SHOULD PRINT TRUE");
		System.out.println(object1.before(object4));
		System.out.println("ABOVE SHOULD PRINT TRUE");


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		SimpleDate object12 = SimpleDate.of(1999,3,12);
		SimpleDate object22 = SimpleDate.of(2001,4,3);
		SimpleDate object32 = SimpleDate.of(2001,6,11);
		SimpleDate object42 = SimpleDate.of(2001,4,9);

		output.println(object12.before(object22));
		output.println("ABOVE SHOULD PRINT TRUE");
		output.println(object12.before(object32));
		output.println("ABOVE SHOULD PRINT TRUE");
		output.println(object12.before(object42));
		output.println("ABOVE SHOULD PRINT TRUE");


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
