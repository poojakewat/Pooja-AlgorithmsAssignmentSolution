package com.greatlearning.model;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.greatlearning.service.BinarySearch;
import com.greatlearning.service.MergeSort;

public class CompanyStocks {
	double[] stocks;
	int noOfCompany;
	boolean flag;
	int count=0;
	int countTrue=0;

	int countFalse=0;
	Scanner sc;

	public int getCountTrue() {
		return countTrue;
	}


	public int getCountFalse() {
		return countFalse;
	}

	public CompanyStocks(int noOfCompany) {

		this.noOfCompany = noOfCompany;
		stocks = new double[noOfCompany];
	}

	public void input() {
		sc=new Scanner(System.in);
		for(int i=0;i<noOfCompany;i++) {
			++count;
			System.out.println("Enter current stock price of the company "+count);
			stocks[i]=sc.nextDouble();
			checkCount();

		}
	}
	void checkCount() {

		while(true) {
			try {

				System.out.println("Whether company's stock price rose today compare to yesterday. Please enter true or false");
				flag=sc.nextBoolean();
				break;

			}

			catch (InputMismatchException e) {
				sc.nextLine();

			}
		}
		if(flag)
			countTrue++;
		else
			countFalse++;


	}
	public void display() {
		System.out.println("Stock prices in ascending order are :");
		for(int i=0;i<noOfCompany;i++) {
			System.out.print(stocks[i]+" ");
		}
		System.out.println();
	}
	public void displayDsc() {
		System.out.println("Stock prices in Descending order are :");
		for(int i=noOfCompany-1;i>=0;i--) {

			System.out.print(stocks[i]+" ");
		}
		System.out.println();
	}

	public void sortAsc() {
		MergeSort ms = new MergeSort();
		ms.sort(stocks,0,stocks.length-1);
	}

	public void sarchStock(double stockKey) {
		double foundkey= BinarySearch.binarySearchRecursive(stocks, 0, stocks.length-1, stockKey);
		if(foundkey!=-1)
			System.out.println("Stock of value " + stockKey+ " is present");
		else
			System.out.println("Stock of value " + stockKey+ " not is present");
	}

}
