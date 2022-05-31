package entities;

public final class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double paymentOutSourced() {
		return super.payment() + (additionalCharge + (additionalCharge / 10));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + " - $" + paymentOutSourced() + "\n");
		return sb.toString();
	}

}
