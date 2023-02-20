
public class HealthInsurance extends Insurence {

	public HealthInsurance(String insurenceName, double inurenceValue, String startDate, String endDate) {
		super(insurenceName, inurenceValue, startDate, endDate);
		
	}

	@Override
	public double calculate() {
		return 0;
	}

}
