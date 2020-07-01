public String mixString(String a, String b) {
  String result = "";
  int i=0;
  while(i<a.length() && i<b.length()){
  result= result+ a.charAt(i) + b.charAt(i);
  i++;

}
return result+ a.substring(i) + b.substring(i);
}

//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

//mixString("abc", "xyz") → "axbycz"
//mixString("Hi", "There") → "HTihere"
//mixString("xxxx", "There") → "xTxhxexre"
