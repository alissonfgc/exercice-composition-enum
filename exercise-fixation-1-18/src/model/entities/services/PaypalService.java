package model.entities.services;

public class PaypalService implements OnlinePaymentService {
	
	@Override
	public Double interest(Double amount, Integer mouths) {
		return amount += (amount * 0.01) * mouths;
	}
	
	@Override
	public Double paymentFee(Double amount) {
		return amount += (amount * 0.02);
	}

}
