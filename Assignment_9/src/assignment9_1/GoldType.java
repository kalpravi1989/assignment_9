package assignment9_1;

public class GoldType extends Customer {

	public GoldType(double billamt) {
		super(billamt);
	}

	@Override
	public void selectdiscountpercentage() {
		if (billamt > 20000) {
			setDiscountpercentage(30);
		} else if (billamt >= 10001 && billamt <= 20000) {
			setDiscountpercentage(25);
		} else if (billamt <= 10000 && billamt >= 1) {
			setDiscountpercentage(10);
		}

	}

}
