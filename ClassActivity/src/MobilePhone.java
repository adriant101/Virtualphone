
public class MobilePhone {

	private String manufacturer;
	private String model;
	private int price;
	private String carrier;
	
	
	public MobilePhone(String manufacturer, String model, int price, String carrier) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	
	public String call(String phoneNumber) {
		return "I'm calling: " + phoneNumber;
		
		
	}
	public String text(String textMessage) {
		return textMessage + "\nSent!";
	}

	@Override
	public String toString() {
		return "MobilePhone [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", carrier="
				+ carrier + "]";
	}
	
}
