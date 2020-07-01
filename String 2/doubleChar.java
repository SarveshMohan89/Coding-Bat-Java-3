public String doubleChar(String str) {
  int len= str.length();
  String A= "";

  for(int i=0; i< len; i++)
  {A += str.substring(i, i+1) + str.substring(i, i+1);
  }

  return A;
}

//Given a string, return a string where for every char in the original, there are two chars.

//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"
