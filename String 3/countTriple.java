public int countTriple(String str) {


	  int count = 0;



	  for (int i = 0; i < str.length()-2; i++){
   char A = str.charAt(i);


	    if (A == str.charAt(i+1) && A == str.charAt(i+2))

	      count++;

	  }

	  return count;

	}


//We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

//countTriple("abcXXXabc") → 1
//countTriple("xxxabyyyycd") → 3
//countTriple("a") → 0
