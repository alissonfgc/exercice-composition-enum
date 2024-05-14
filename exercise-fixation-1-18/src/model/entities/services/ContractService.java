package model.entities.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void ProcessContract(Contract contract, Integer months) {
		
		for (Integer i = 1; i <= months; i++) {
			
			Double result = onlinePaymentService.interest(contract.getTotalValue()/months, i);
			result = onlinePaymentService.paymentFee(result);
			
			contract.addInstallment(new Installment(contract.getDate().plusMonths(i), result));
			
		}

	}
	
}
