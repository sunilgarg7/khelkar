package com.khelkar.sunil.DesignInterviewQuestions;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Arrays;


// u have a file with multiple string lines and u have to put it into another file in fair random manner, how would you implement it with linkedlist and array only.
// the distribution should be random i.e. should not follow any pattern.
public class FairRandomDistributionDataFromOneToOtherFile {

	public static void main(String[] args) {
		// Driver Program to read the lines into the String Array.
		 FileReader fr = null;
	     LineNumberReader lnr = null;
	     try {  
	    	
	    	// Please Pass the File Path to the below filereader to run this program
	    	 
	    	fr = new FileReader("/home/sgarg/Documents/workspace-spring-tool-suite-4-4.10.0.RELEASE/Interveiw/src/com/sunil/stringfile");
	    	lnr = new LineNumberReader(fr);
	    	lnr.mark(500); // some random read ahead limit, I just choose 5000 randomly
			lnr.skip(Integer.MAX_VALUE);
			int totalLines = lnr.getLineNumber();
			String[] data = new String[totalLines];
			// resetting to mark, basically start of the file
			lnr.reset();	
			for (int i=0; i<totalLines; i++) {
				data[i] = lnr.readLine();
			}

			shuffleAndWriteDataToNewFile(data);
			
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  
		
	}
	
	/**
	 * @param data    - All lines of the files read and passed as String into this String[] 
	 * 
	 */
	public static String[] shuffleAndWriteDataToNewFile(String[] data) {
		int len = data.length;
		int rand= 0;
		for (int i=0; i < len; i++) {
			// choose the next random number between the all current valid lines
			rand = getNextRandomNumber(len - i);
			// Now whatever the random line we get, we will move it to the end of the array and assume that 
			// next random number generator will generate random lines from 0 to len - i 
			swapLine(data, i, rand);
			// this way our random lines getting settled in the last index of the array which keeps decrementing with loop iteration
			// this way we dont need to take a 2nd array to store the lines and complexity vise it is an O(N) solution as we are iterating 
			// over the array once.
		}
		
		return data;
	}
	
	/**
	 * Swap two String Objects in the given String Array.
	 */
	public static void swapLine(String[] data, int curr, int rand) {
		int len = data.length;
		String temp = data[len-1 - curr];
		data[len -1 -curr]  = data[rand];
		data[rand] = temp;
	}
	
	public static int getNextRandomNumber(int numOfElements) {
		return (int)(Math.random() * numOfElements);
	}
	
}
