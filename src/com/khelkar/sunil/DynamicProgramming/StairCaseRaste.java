package com.khelkar.sunil.DynamicProgramming;

import java.util.ArrayList;

public class StairCaseRaste {

	public static void main(String[] args) {
		int totalstaircase = 6;
		int[] jumps = {1,3,5};
		
		// get the total number of ways through which I can cover these totalstaircase with
		// the jumps available
		ArrayList<String> ans = new ArrayList<String>();
		
		int result= getTotalWaysOfJump(totalstaircase, jumps, "", ans);
		System.out.println(result);
		System.out.println(ans);
	}
	
	
	static int getTotalWaysOfJump(int totalstaircase, int[] jumps, String asf, ArrayList<String> ans) {

		if (totalstaircase < 0) {
			return 0;
		}else if (totalstaircase == 0) { 
			ans.add(asf);
			System.out.println(asf);
			return 1;
		}
	
		int jump=0;
		for (int j : jumps) {
			jump += getTotalWaysOfJump(totalstaircase- j, jumps, asf + j, ans);
		}
		//asf += ",";
		
		return jump;
	}
	
}
