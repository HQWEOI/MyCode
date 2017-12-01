package practice_11_20;

public class CheckoutCounter {
	double unitPrice;
	double quantity;
	double amount;
	double amountReceivable;
	double change;
	
	public double cashier(double amount,double amountReceivable) {
	if(amount>=500){
		amount = amount* 0.8;
	}
	if(amount<amountReceivable) {
		System.out.println();
	}
	
		return amount;
	}
	
	
}
