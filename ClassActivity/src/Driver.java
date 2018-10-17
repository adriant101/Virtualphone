import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
String manufacturer;
String model;
int price;
String carrier;
String phoneNo;
String createPhone = "Y";
String text = "";
Scanner myScan = new Scanner(System.in);
BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 


do {
	System.out.println("Who is your phone manufacturer?");
	manufacturer = myScan.next();
	System.out.println("What is your phone's model?");
	model = myScan.next();
	System.out.println("What is your phone's price?");
	price = myScan.nextInt();
	System.out.println("Who is your carrier?");
	carrier = myScan.next();
	
	MobilePhone myPhone = new MobilePhone(manufacturer, model, price, carrier);
	
	System.out.println(myPhone);

	
		System.out.println("Enter the number you would like to call: ");
		phoneNo = myScan.next();
		System.out.println(myPhone.call(phoneNo));
	
		System.out.println("Type your text message: ");
		try {
			text = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(myPhone.text(text));
		System.out.println("\n");
		System.out.println("Would you like to create another virtual phone? Y/N");
		createPhone = myScan.next();
	
		
}while(createPhone.equalsIgnoreCase("Y"));


		
		
	}

}
