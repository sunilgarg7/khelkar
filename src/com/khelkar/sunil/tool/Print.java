package com.khelkar.sunil.tool;

public class Print {
	
	// these variable can be turned on and off, based on whether we need to print comments or not
	public static boolean PRINT_COMMENTS = true;
	public static boolean PRINT_DATA = true;
	
	public static void printComments(String str) {
		if (PRINT_COMMENTS) {
			System.out.println("\n" + str);
		}
	}
	
	public static void printData(String str) {
		if (PRINT_DATA) {
			System.out.println("\n" + str);
		}
	}

	public static void printData(Object obj) {
		if (PRINT_DATA) {
			System.out.println("\n" + obj);
		}
	}
	
}
