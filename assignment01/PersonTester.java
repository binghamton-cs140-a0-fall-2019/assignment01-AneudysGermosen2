package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

	Person Guy1 = new Person("steven", "moore", "123943445", new DateAndPlaceOfBirth(1985, 6, 7, "Bronx", "New york", "United States"), new StreetUSAddress("59 lenox ave", "", "Atlantic City", "NJ", "12342"));
	Person Guy2 = new Person("Jah", "seh", "163612635", new DateAndPlaceOfBirth(1988, 9, 9, "Bellport", "New York", "United States"), new StreetUSAddress("25 boston road", "", "porkbelly", "NY", "12467"));
	Person Guy3 = new Person("jefrey", "epstein", "376738945", new DateAndPlaceOfBirth(1982, 4, 5, "Brooklyn", "New York", "United States"), new StreetUSAddress(" 43 hunts point", "", "bikini bottom", "CA", "12112"));
	Person Guy4 = new Person("frank", "ocean", "922262367", new DateAndPlaceOfBirth(1982, 4, 5, "Patchogue", "New York", "United States"), new StreetUSAddress("34 simpson place", "", "Binghamton", "NY", "90210"));
	System.out.println(Guy1);
	System.out.println(Guy2);
	System.out.println(Guy3);
	System.out.println(Guy4);
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
	DateAndPlaceOfBirth[] DOB2 = new DateAndPlaceOfBirth[6];
	DOB2[1] = new DateAndPlaceOfBirth(1985, 6, 7, "Bronx", "New york", "United States");
	DOB2[2] = new DateAndPlaceOfBirth(1988, 9, 9, "Bellport", "New York", "United States");
	DOB2[3] = new DateAndPlaceOfBirth(1982, 4, 5, "Brooklyn", "New York", "United States");
	DOB2[4] = new DateAndPlaceOfBirth(1982, 4, 5, "Patchogue", "New York", "United States");
	StreetUSAddress[] Add2 = new StreetUSAddress[5];
	Add2[1] = new StreetUSAddress("59 lenox ave", "", "Atlantic City", "NJ", "12342");
	Add2[2] = new StreetUSAddress("25 boston road", "", "porkbelly", "NY", "12467");
	Add2[3] = new StreetUSAddress(" 43 hunts point", "", "bikini bottom", "CA", "12112");
	Add2[4] = new StreetUSAddress("34 simpson place", "", "Binghamton", "NY", "90210");
	Person Guy12 = new Person("steven", "moore", "123943445", DOB2[1], Add2[1]);
	Person Guy22 = new Person("Jah", "seh", "163612635", DOB2[2], Add2[2]);
	Person Guy32 = new Person("jefrey", "epstein", "376738945", DOB2[3], Add2[3]);
	Person Guy42 = new Person("frank", "ocean", "922262367", DOB2[4], Add2[4]);
	output.println(Guy12);
	output.println(Guy22);
	output.println(Guy32);
	output.println(Guy42);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
