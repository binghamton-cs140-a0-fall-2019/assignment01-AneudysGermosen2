package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(2000, 8, 02, "Bellport", "New York", "USA");
		System.out.println(birth1);
		DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(2000, 8, 02, "Binghamton", "New York", "USA");
		System.out.println(birth2);
		DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(2002, 8, 02, "Albany", "New York", "USA");
		System.out.println(birth3);
		DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(2000, 7, 03, "Berlin",  "Germany");
		System.out.println(birth4);
		DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(2000, 8, 21, "London",  "England");
		System.out.println(birth5);

	System.out.println(birth1.olderThan(birth3));
	System.out.println("Above should be true");
	System.out.println(birth3.youngerThan(birth1));
	System.out.println("Above should be true");

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
			DateAndPlaceOfBirth birth12 = new DateAndPlaceOfBirth(2000, 8, 02, "Bellport", "New York", "USA");
			output.println(birth12);
			DateAndPlaceOfBirth birth22 = new DateAndPlaceOfBirth(2000, 8, 02, "Binghamton", "New York", "USA");
			output.println(birth22);
			DateAndPlaceOfBirth birth32 = new DateAndPlaceOfBirth(2002, 8, 02, "Albany", "New York", "USA");
			output.println(birth32);
			DateAndPlaceOfBirth birth42 = new DateAndPlaceOfBirth(2000, 7, 03, "Berlin",  "Germany");
			output.println(birth42);
			DateAndPlaceOfBirth birth52 = new DateAndPlaceOfBirth(2000, 8, 21, "London",  "England");
			output.println(birth52);
System.out.println(birth1.hasSameBirthDayAs(birth2));
System.out.println("Above should be true");
System.out.println(birth1.hasSameBirthDayAs(birth3));
System.out.println("Above should be true");
System.out.println(birth1.hasSameBirthDayAs(birth4));
System.out.println("Above should be false");
System.out.println(birth1.hasSameBirthDayAs(birth5));
System.out.println("Above should be false");
System.out.println(birth2.hasSameBirthDayAs(birth3));
System.out.println("Above should be true");
System.out.println(birth2.hasSameBirthDayAs(birth4));
System.out.println("Above should be false");
System.out.println(birth2.hasSameBirthDayAs(birth5));
System.out.println("Above should be false");
System.out.println(birth3.hasSameBirthDayAs(birth4));
System.out.println("Above should be false");
System.out.println(birth3.hasSameBirthDayAs(birth5));
System.out.println("Above should be false");
System.out.println(birth4.hasSameBirthDayAs(birth5));
System.out.println("Above should be false");

output.println(birth12.hasSameBirthDayAs(birth22));
output.println("Above should be true");
output.println(birth12.hasSameBirthDayAs(birth32));
output.println("Above should be true");
output.println(birth12.hasSameBirthDayAs(birth42));
output.println("Above should be false");
output.println(birth12.hasSameBirthDayAs(birth52));
output.println("Above should be false");
output.println(birth22.hasSameBirthDayAs(birth32));
output.println("Above should be true");
output.println(birth22.hasSameBirthDayAs(birth42));
output.println("Above should be false");
output.println(birth22.hasSameBirthDayAs(birth52));
output.println("Above should be false");
output.println(birth32.hasSameBirthDayAs(birth42));
output.println("Above should be false");
output.println(birth32.hasSameBirthDayAs(birth52));
output.println("Above should be false");
output.println(birth42.hasSameBirthDayAs(birth52));
output.println("Above should be false");

	output.println(birth12.olderThan(birth32));
	output.println("ABOVE SHOULD BE TRUE");
	output.println(birth32.youngerThan(birth12));
	output.println("ABOVE SHOULD BE TRUE");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
