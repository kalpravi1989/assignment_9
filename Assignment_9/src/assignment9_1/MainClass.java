package assignment9_1;

import java.util.Scanner;

public class MainClass {


	static int type;
	static double billamt;
	static Scanner sc = new Scanner(System.in);
	static String test = null;

	static int cont = 0;

	public static void main(String[] args) {

		do {
			Getdata data = new Getdata();
			data.getType();
			System.out.println(type);

			billamt = data.getBillAmt();
			Customer cus = null;
			switch (type) {
			case 1:
			{
				cus = new PlatinumType(billamt);
				break;
			}
			case 2:
			{
				cus = new GoldType(billamt);
				break;
			}
			case 3:
			{
				cus = new ClassicType(billamt);
				break;
			}
			}
			cus.selectdiscountpercentage();
			cus.discount();
			System.out.println("Discount percentage : " + cus.getDiscountpercentage() + "%");
			System.out.println("Discount amt : " + cus.getDiscount());
			System.out.println("final amount :" + cus.getFinalbill());
			System.out.println("if you want to continue press 1 or press any other number");
			cont = sc.nextInt();

		} while (cont == 1);

	}


}

class Getdata extends MainClass {

	public int getType() {
		
		System.out.println("Enter customer type :");
		System.out.println("1.Platinum\n2.Gold\n3.Classic");
		int i = sc.nextInt();
		;
		if (i == 1) {
			type = 1;
		} else if (i == 2) {
			type = 2;
		} else if (i == 3)
			type = 3;
		else {
			System.out.println("enter vaild type");
			getType();

		}
		return type;
	}


	public double getBillAmt() {
		System.out.println("Enter bill Amount");

		double bill = sc.nextDouble();
		return bill;

	}

}