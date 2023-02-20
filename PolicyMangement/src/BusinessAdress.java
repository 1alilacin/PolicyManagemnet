
public class BusinessAdress extends Adress {
	private String companyName;

	public BusinessAdress(String city, String street, String number, String town,String companyName) {
		super(city, street, number, town);
		this.companyName=companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
