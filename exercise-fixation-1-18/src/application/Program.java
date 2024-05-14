package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.entities.services.ContractService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		String date = sc.nextLine();
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		Integer numberOfInstallments = sc.nextInt();

		Contract obj = new Contract(number, date, totalValue);

		ContractService service = new ContractService();

		service.ProcessContract(obj, numberOfInstallments);

		System.out.print("Parcelas:");

		for (Installment i : obj.getInstallments()) {
			StringBuilder sb = new StringBuilder();
			sb.append("\n" + i.getDueDate().format(Contract.fmt) + " - " + i.getAmount());
			System.out.print(sb);
		}

		sc.close();

	}

}
