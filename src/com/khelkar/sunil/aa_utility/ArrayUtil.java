package com.khelkar.sunil.aa_utility;

public interface ArrayUtil {
				// j => increase this side --->  -->    cols  ---->
int[][] src= { 	{1 /*00*/,   2 /*01*/,   3/*02*/,   4 /*03*/,   5}/*04*/,  // i
			 	{6 /*10*/,   7 /*11*/,   8/*12*/,   9 /*13*/,  10}/*14*/,  // 
			 	{11/*20*/,  12 /*21*/,  13/*22*/,   14/*23*/,  15}/*24*/,  // 0
			 	{16/*30*/,  17 /*31*/,  18/*32*/,   19/*33*/,  20}/*34*/,  // to
			 	{21/*40*/,  22 /*41*/,  23/*42*/,   24/*43*/,  25}/*44*/};// n
				//     <----  <----  THIS side <==    j decreases 


// rows = 6 and cols = 5
int[][] src_Rect1= {{1 /*00*/,   2 /*01*/,   3/*02*/,   4 /*03*/,   5}/*04*/,  
					{6 /*10*/,   7 /*11*/,   8/*12*/,   9 /*13*/,  10}/*14*/, 
					{11/*20*/,  12 /*21*/,  13/*22*/,   14/*23*/,  15}/*24*/, 
					{16/*30*/,  17 /*31*/,  18/*32*/,   19/*33*/,  20}/*34*/, 
					{21/*40*/,  22 /*41*/,  23/*42*/,   24/*43*/,  25}/*44*/, 
					{26/*50*/,  27 /*51*/,  28/*52*/,   29/*53*/,  30}/*54*/ };
		
//rows = 5 and cols = 6
int[][] src_Rect2= {{1 /*00*/,   2 /*01*/,   3/*02*/,   4 /*03*/,   5, /*04*/  26 },  
					{6 /*10*/,   7 /*11*/,   8/*12*/,   9 /*13*/,  10/*14*/,   27 },  
					{11/*20*/,  12 /*21*/,  13/*22*/,   14/*23*/,  15/*24*/,   28 }, 
					{16/*30*/,  17 /*31*/,  18/*32*/,   19/*33*/,  20/*34*/,   29 }, 
					{21/*40*/,  22 /*41*/,  23/*42*/,   24/*43*/,  25/*44*/,   30 }};
				//	{26/*50*/,  27 /*51*/,  28/*52*/,   29/*53*/,  30}/*54*/ };


int[][] a1 = { 		{4/**/,  5/**/,  7/**/,  98/**/,  9}/**/,  
					{1/**/,  4/**/,  6/**/,   1/**/,  2}/**/, 
				 	{3/**/,  6/**/,  1/**/,   2/**/,  1}/**/, 
				 	{11/**/, 23/**/, 33/**/,  1/**/,  21}/**/, 
				 	{54/**/, 21/**/,  3/**/,  2/**/,  1 } };
		
//rows = 9 and cols = 9
int[][] sudoku= {   {2, 0, 0, 0, 0, 0, 0, 0, 4},
			    	{0, 1, 0, 0, 0, 0, 0, 5, 0},
			    	{0, 0, 3, 0, 0, 0, 6, 0, 0},
			    	{0, 0, 0, 4, 0, 9, 0, 0, 0},
			    	{0, 0, 0, 0, 5, 0, 0, 0, 0},
			    	{0, 0, 0, 7, 0, 6, 0, 0, 0},
			    	{0, 0, 6, 0, 0, 0, 7, 0, 0},
			    	{0, 5, 0, 0, 0, 0, 0, 8, 0},
			    	{4, 0, 0, 0, 0, 0, 0, 0, 9} };


}
