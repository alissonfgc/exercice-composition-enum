package model.entities.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	public void ProcessContract(Contract contract, Integer months) {
		
		for (Integer i = 1; i <= months; i++) {
			
			OnlinePaymentService service = new PaypalService();
			
			Double result = service.interest(contract.getTotalValue()/months, i);
			result = service.paymentFee(result);
			
			contract.addInstallment(new Installment(contract.getDate().plusMonths(i), result));
			
		}

	}
	
}
