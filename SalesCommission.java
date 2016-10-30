package caseStudies;

import java.util.Scanner;
/**
 * 
 * Hal’s Home Computer Emporium is a retail seller of home computers. 
 * Hal’s sales staff works strictly on commission. 
 * For example, a salesperson with $16,000 in monthly sales will earn a 12% commission ($1,920). 
 * Another salesperson with $20,000 in monthly sales will earn a 15% commission ($3,000). 
 * Because the staff gets paid once per month, Hal allows each employee to take up to $1,500 per month in advance. 
 * When sales commissions are calculated, the amount of each employee’s advanced pay is 
 * subtracted from the commission. If any salesperson’s commissions are less than the amount of their advance, 
 * they must reimburse Hal for the difference.
 *
 */

public class SalesCommission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salesperson’s monthly sales");
		double sales = sc.nextDouble();
		System.out.println("enter the amount of advanced pay");
		double advancePay = sc.nextDouble();
		double rate = 0.0;
		
		if(sales < 10_000){
			rate = 0.05;
		}
		else if (sales > 10_000 && sales < 14_999){
			rate = 0.10;
		}
		else if (sales > 15_000 && sales < 17_999){
			rate = 0.12;
		}
		else if (sales > 18_000 && sales < 21_999){
			rate = 0.15;
		}
		else{
			rate = 0.16;
		}
		
		double commission = sales * rate;
		
		double pay = 0.0;
		if(commission < advancePay){
			pay = advancePay - commission;
		}else {
			pay = commission - advancePay;
		}
		System.out.println("Pay is " + "$" + pay);
		sc.close();

	}

}
