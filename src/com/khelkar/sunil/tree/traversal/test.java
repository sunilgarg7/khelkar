package com.khelkar.sunil.tree.traversal;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class test {

	
	public static void main(String[] args) {
	//	System.out.println("nifty" instanceof String);
		System.out.println(Boolean.parseBoolean("FalSe"));
		
		
		ArrayList list = new ArrayList();
		
		
		list.add(1);
		
//		list.sort(List.D);
		
/**		try {
			System.out.println("a");
			throw new Error();
		} catch (Exception ex) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		} **/
		
		validateJavaDate("210408054449994");
		
	}
	
	public static boolean validateJavaDate(String strDate) {
		SimpleDateFormat fr = new SimpleDateFormat("yyddHHmmss");
			java.util.Date javaDate = null;
			try {
			
				javaDate = fr.parse(strDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(javaDate);
		return true;
	}


}
