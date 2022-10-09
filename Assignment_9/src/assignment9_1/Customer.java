package assignment9_1;

public abstract class Customer {

	double billamt;
	private double discountpercentage;
	private double discount;
	private double finalbill;

	public Customer(double billamt) {
		this.billamt = billamt;
	}

	public double getDiscount() {
		return discount;
	}


	public double getFinalbill() {
		return finalbill;
	}


	public void setDiscountpercentage(double discountpercentage) {
		this.discountpercentage = discountpercentage;
	}

	public double getDiscountpercentage() {
		return discountpercentage;
	}




	public abstract void selectdiscountpercentage();

	public void discount() {
		discount = billamt * discountpercentage / 100;
		finalbill = billamt - discount;

	}
}
