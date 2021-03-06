import java.util.*;

class Employee {
	protected String name = new String();
	protected Date startDate = new Date();
	protected Date dateOfBirth = new Date();
	protected double weeklyPayAmount;
	protected double weeklyTaxAmount;

	public Employee() {
	}

	public Employee(String name, Date startDate, Date dateOfBirth, double weeklyPayAmount, double weeklyTaxAmount) {
		this.name = new String(name);
		this.startDate = new Date(startDate);
		this.dateOfBirth = new Date(dateOfBirth);
		this.weeklyPayAmount = weeklyPayAmount;
		this.weeklyTaxAmount = weeklyTaxAmount;
	}

	public Employee(Employee employee) {
		this.name = new String(employee.name);
		this.startDate = new Date(employee.startDate);
		this.dateOfBirth = new Date(employee.dateOfBirth);
		this.weeklyPayAmount = employee.weeklyPayAmount;
		this.weeklyTaxAmount = employee.weeklyTaxAmount;
	}

	public String getName() {
		return name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date dateOfBirth() {
		return dateOfBirth;
	}

	public double getWeeklyPayAmount() {
		return weeklyPayAmount;
	}

	public double getWeeklyTaxAmount() {
		return weeklyTaxAmount;
	}

	public void setName(String name) {
		this.name = new String(name);
	}

	public void setStartDate(Date startDate) {
		this.startDate = new Date(startDate);
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = new Date(dateOfBirth);
	}

	public void setWeeklyPayAmount(double weeklyPayAmount) {
		this.weeklyPayAmount = weeklyPayAmount;
	}

	public void setWeeklyTaxAmount(double weeklyTaxAmount) {
		this.weeklyTaxAmount = weeklyTaxAmount;
	}

	public void calcWeeklyPayAmount() {
	}

	public void calcWeeklyTaxAmount() {
		if (weeklyPayAmount > 2000)
			weeklyTaxAmount = weeklyPayAmount * 0.3;
		else if (weeklyPayAmount < 1000)
			weeklyTaxAmount = 0;
		else
			weeklyTaxAmount = weeklyPayAmount * 0.2;
	}

	public String toString() {
		return name + " Pay: $" + weeklyPayAmount + " Tax $" + weeklyTaxAmount;
	}
}
