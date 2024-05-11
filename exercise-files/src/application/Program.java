package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter a file path: ");
		String sourceFileStr = sc.nextLine();
		File sourceFile = new File(sourceFileStr);

		String sourceFolderStr = sourceFile.getParent();
		boolean success = new File(sourceFolderStr + File.separator + "out").mkdir();

		String targetFileStr = sourceFolderStr + File.separator + "out" + File.separator + "summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String line = br.readLine();

			while (line != null) {

				String[] dataProduct = line.split(",");

				String name = dataProduct[0];
				Double price = Double.valueOf(dataProduct[1]);
				Integer quantity = Integer.valueOf(dataProduct[2]);

				products.add(new Product(name, price, quantity));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

			for (Product p : products) {

				bw.write(p.getName() + "," + String.format("%.2f", p.calculateTotalPrice()));
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
