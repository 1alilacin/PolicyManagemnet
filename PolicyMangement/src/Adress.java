
public class Adress {
	private String city;
	private String street;
	private String number;
	private String town;
	public Adress(String city, String street, String number, String town) {
		super();
		this.city = city;
		this.street = street;
		this.number = number;
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	
}
