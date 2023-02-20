
public class ResidenceInsurance extends Insurence{

	public ResidenceInsurance(String insurenceName, double insurenceValue, String startDate, String endDate) {
		super(insurenceName, insurenceValue, startDate, endDate);
	}

	@Override
	public double calculate() {
		return 0;
	}

}
