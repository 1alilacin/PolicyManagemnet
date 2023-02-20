
public class CarInsurance extends Insurence {

	public CarInsurance(String insurenceName, double insurenceValue, String startDate, String endDate) {
		super(insurenceName, insurenceValue, startDate, endDate);
		
	}

	@Override
	public double calculate() {
		return 0;
	}

}
