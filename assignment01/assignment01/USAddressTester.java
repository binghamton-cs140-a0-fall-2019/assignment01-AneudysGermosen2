package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress add1 = new StreetUSAddress("4 Pool rd.", "4400 Vestal PKWY", "Vestal", "NY", "13902");
        	System.out.println(add1);
		StreetUSAddress add2 = new StreetUSAddress("65 Country Club rd.","", "Binghamton", "NY", "13902");
        	System.out.println(add2);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
			StreetUSAddress add12 = new StreetUSAddress("4 Pool rd.", "4400 Vestal PKWY", "Vestal", "NY", "13902");
        		output.println(add12); // T
			StreetUSAddress add22 = new StreetUSAddress("65 Country Club rd.","", "Binghamton", "NY", "13902");
			output.println(add22);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
	
