import java.util.Scanner;

// Car Tax Calculation
public class App {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Add your car's brand = ");
		String brand = in.nextLine();
		System.out.print("Add your car's type = ");
		String type = in.nextLine();
		System.out.print("What year was your car made? = ");
		int year = in.nextInt();
		int tax = taxCalculate(year);
		System.out.println("Yearly tax for " + brand + " " + type + " " + year + " is Rp. " + tax);

        in.close();

	}
 

	static int taxCalculate(int year) {
		int tax;
		if (year == 0) {
			throw new IllegalArgumentException("Year must not be zero");
        } else if (year > 2020) {
			tax = 4000000;
		} else if (year > 2010) {
			tax = 2000000;
		} else if (year > 2000) {
			tax = 1000000;
		} else if (year > 1990) {
			tax = 750000;
		} else if (year > 1980) {
			tax = 500000;
		} else {
			tax = 250000;
		}
		return tax;
	}
}
