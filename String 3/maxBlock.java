public int maxBlock(String str) {
   int len = str.length();

	  int count = 0;

	  int A = 1;

	  if (len == 0)

	    return 0;
for (int i = 0; i < len; i++) {
	    if (i < len-1 && str.charAt(i) == str.charAt(i+1))

	     A++;

	    else

	      A = 1;

	    if (A > count)

	      count = A;

	  }

	  return count;

	}

//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

//maxBlock("hoopla") → 2
//maxBlock("abbCCCddBBBxx") → 3
//maxBlock("") → 0
