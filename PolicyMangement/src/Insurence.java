
public abstract class Insurence {
	private String insurenceName;
	private double insurenceValue;
	private String startDate;
	private String endDate;
	
	public Insurence(String insurenceName, double insurenceValue, String startDate, String endDate) {
		super();
		this.insurenceName = insurenceName;
		this.insurenceValue = insurenceValue;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getIsurenceName() {
		return insurenceName;
	}

	public void setIsurenceName(String insurenceName) {
		this.insurenceName = insurenceName;
	}

	public double getInurenceValue() {
		return insurenceValue;
	}

	public void setInurenceValue(double insurenceValue) {
		this.insurenceValue = insurenceValue;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}
	

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public abstract double calculate();
	
	
}
