package assignment9_1;

public class ClassicType extends Customer {

	public ClassicType(double billamt) {
		super(billamt);
	}

	@Override
	public void selectdiscountpercentage() {
		if (billamt > 20000) {
			setDiscountpercentage(20);
		} else if (billamt >= 10001 && billamt <= 20000) {
			setDiscountpercentage(15);
		} else if (billamt <= 10000 && billamt >= 1) {
			setDiscountpercentage(10);
		}


	}

}
