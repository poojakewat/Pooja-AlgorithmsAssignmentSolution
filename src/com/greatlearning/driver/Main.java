package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.CompanyStocks;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfCompany;
		try {

			System.out.println("enter the no of companies");
			noOfCompany = sc.nextInt();
			CompanyStocks s = new CompanyStocks(noOfCompany);
			s.input();
			int ch;
			double stockKey;

			System.out.println("\nEnter the operation that you want to perform");

			do {
				System.out.println("-----------------------------------------------");
				System.out.println("1. Display the companies stock prices in ascending order");
				System.out.println("2. Display the companies stock prices in descending order");
				System.out.println("3. Display the total no of companies for which stock prices rose today");
				System.out.println("4. Display the total no of companies for which stock prices declined today");
				System.out.println("5. Search a specific stock price");
				System.out.println("6. press 0 to exit");
				System.out.println();
				System.out.println("-----------------------------------------------");

				ch =sc.nextInt();

				switch(ch) {

				case 1:
				{
					s.sortAsc();
					s.display();
				}break;
				case 2:
				{
					s.displayDsc();
				}break;
				case 3:
				{
					System.out.println("Total no of companies whose stock price rose today :" +s.getCountTrue());
				}break;
				case 4:
				{
					System.out.println("Total no of companies whose stock price declined today : " +s.getCountFalse());
				}break;
				case 5:
				{
					System.out.println("Enter the key value");
					stockKey = sc.nextDouble();
					s.sarchStock(stockKey);
				}break;
				default:
					System.out.println("Exited successfully");
				}

			}while(ch!=0);

		}finally {
			sc.close();
		}
	}

}
