package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person Guy1 = new Person("Jeff", "Diamonds", "123948745", new DateAndPlaceOfBirth(1982, 4, 5, "Atlantic City", "New Jersey", "United States"), new StreetUSAddress("40-53 Dowry Lane", "", "Atlantic City", "NJ", "12112"));

		ComputerOwner compOwner = new ComputerOwner(Guy1);
		Computer file1 = new Computer("MSI", "Apache", 16, 500, true, 800.00);
		Computer file2 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer file3 = new Computer("MSI", "GL63", 16, 2000, true, 1500.00);
		Computer file4 = new Computer("Apple", "Touch", 16, 300, false, 3000.00);

		compOwner.addComputer(file1);
		compOwner.addComputer(file2);
		compOwner.addComputer(file3);
		compOwner.addComputer(file4);
		System.out.println(compOwner);

		compOwner.removeComputer(2);
		compOwner.removeComputer(2);
		System.out.println(compOwner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		Person Guy12 = new Person("Jeff", "Diamonds", "123948745", new DateAndPlaceOfBirth(1982, 4, 5, "Atlantic City", "New Jersey", "United States"), new StreetUSAddress("40-53 Dowry Lane", "", "Atlantic City", "NJ", "12112"));

		ComputerOwner compOwner2 = new ComputerOwner(Guy1);
		Computer file12 = new Computer("MSI", "Apache", 16, 500, true, 800.00);
		Computer file22 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer file32 = new Computer("MSI", "GL63", 16, 2000, true, 1500.00);
		Computer file42 = new Computer("Apple", "Touch", 16, 300, false, 3000.00);

		compOwner2.addComputer(file12);
		compOwner2.addComputer(file22);
		compOwner2.addComputer(file32);
		compOwner2.addComputer(file42);
		System.out.println(compOwner2);

		compOwner2.removeComputer(2);
		compOwner2.removeComputer(2);
		System.out.println(compOwner2);





		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
