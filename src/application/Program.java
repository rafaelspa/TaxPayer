package application;

/* Modulo 4 - Chapter 8 - TaxPayer Challenge - Escola Devsuperior
 * Prof. Nelio Alves
 * rsdepaula67@gmail.com
 * 
 * Program to calculate simple taxes.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		TaxPayer tp = new TaxPayer();
		
		// Number of taxes to be calculated
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		// Gathering income information
		for (int i = 0; i < n; i++) {
			tp = new TaxPayer();
			System.out.printf("%nDigite os dados do %do contribuinte:%n", i + 1);
			System.out.print("Renda anual com salário: ");
			tp.setSalaryIncome(sc.nextDouble());
			System.out.print("Renda anual com prestação de serviço: ");
			tp.setServicesIncome(sc.nextDouble());
			System.out.print("Renda anual com ganho de capital: ");
			tp.setCapitalIncome(sc.nextDouble());
			System.out.print("Gastos médicos: ");
			tp.setHealthSpending(sc.nextDouble());
			System.out.print("Gastos educacionais: ");
			tp.setEducationSpending(sc.nextDouble());
			taxPayers.add(tp);
		}
		
		// Processing and displaying the taxes.
		for (int i = 0; i < taxPayers.size(); i++) {
			if (i > 0) {
				System.out.println();
			}
			System.out.printf("%nResumo do %do contribuinte:%n", i + 1);
			System.out.printf("Imposto bruto total: %.2f%n", taxPayers.get(i).grossTax());
			System.out.printf("Abatimento: %.2f%n", taxPayers.get(i).taxRebate());
			System.out.printf("Imposto devido: %.2f", taxPayers.get(i).netTax());
		}
		
		sc.close();
	}

}
