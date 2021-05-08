package com.khelkar.sunil.twest;


public class nullVerification {

	
	public static void main(String[] args) {
		
		Object a = getNull();
		Object b = getNull();
		
	
		
		if (a != b) {
			System.out.println("null not matched");
		} else {
			System.out.println("null matched ");
		}
		
	}

	private static Object getNull() {
		return null;
	}
	
}
