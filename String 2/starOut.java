public String starOut(String str) {
 int len = str.length();

	  String A = "";


	  for (int i = 0; i < len; i++) {

	    if (i == 0 && str.charAt(i) != '*')

	      A += str.charAt(i);

	    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')

	      A += str.charAt(i);

	    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')

	      A = A.substring(0,A.length()-1);

	  }
	  return A;
}

//Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

//starOut("ab*cd") → "ad"
//starOut("ab**cd") → "ad"
//starOut("sm*eilly") → "silly"
