package model.entities.services;

public class PaypalService implements OnlinePaymentService {

	public Double interest(Double amount, Integer mouths) {
		return amount += (amount * 0.01) * mouths;
	}

	public Double paymentFee(Double amount) {
		return amount += (amount * 0.02);
	}

}
