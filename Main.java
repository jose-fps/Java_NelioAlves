package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		
		String product1 = "Computer";
		String product2 = "Office desk";
		 
		int age = 30;
		int code =5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %nComputer, which price is $ %.2f %n"
				+ "Office desk, which price is $%.2f%n %n"
				+ "Record: %d years old, code %d and gender: %s %n %n"
				+ "Measure with eight decimal places:%.6f%n"
				+ "Rouded (three decimal places): %.3f%n"
				+ "US decimal point: %.3f%n  ",price1,price2,age,code,gender,measure,measure, measure);
		
		
	}

}


Exercicio correto.

 import java.util.Locale;
 public class Main{
 public staticvoid main(String[] args) {
 String product1 = "Computer";
 String product2 = "Office desk";
 byteage= 30;
 intcode= 5290;
 chargender= 'F';
 double price1= 2100.0;
 double price2= 650.50;
 double measure= 53.234567;
 System.out.println("Products:");
 System.out.printf("%s, which price is $ %.2f%n", product1, price1);
 System.out.printf("%s, which price is $ %.2f%n", product2, price2);
 System.out.println();
 System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
 System.out.println();
 System.out.printf("Measue with eight decimal places: %.8f%n", measure);
 System.out.printf("Rouded (three decimal places): %.3f%n", measure);
 Locale.setDefault(Locale.US);
 System.out.printf("US decimal point: %.3f%n", measure);
 }
 }
