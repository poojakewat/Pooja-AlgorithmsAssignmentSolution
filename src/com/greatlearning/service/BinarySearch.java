package com.greatlearning.service;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}
	public static int binarySearchRecursive(double arr[], int low,int high, double key) {

		if (high<low) {
			return -1;
		}
		int mid = (high + low)/2;
		if(arr[mid]==key)
			return mid;

		else if(arr[mid]<key)
			return binarySearchRecursive(arr, mid+1,high,key);

		return binarySearchRecursive(arr, 0,mid-1,key);

	}
}
