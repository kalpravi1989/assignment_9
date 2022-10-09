package assignment9_1;

public class PlatinumType extends Customer {

	public PlatinumType(double billamt) {
		super(billamt);

	}

	@Override
	public void selectdiscountpercentage() {

		if (billamt >= 20000) {
			setDiscountpercentage(40);
		} else if (billamt >= 10001 && billamt < 20000) {
			setDiscountpercentage(35);
		} else if (billamt <= 10000 && billamt >= 1) {
			setDiscountpercentage(30);
		}
	}

}
