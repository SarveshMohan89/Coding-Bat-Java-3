public String getSandwich(String str) {
  int A= str.indexOf("bread");
  int B= str.lastIndexOf("bread");

  if(A==B){

    return "" ;

  }
  return str.substring(A+5, B);

}

//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

//getSandwich("breadjambread") → "jam"
//getSandwich("xxbreadjambreadyy") → "jam"
//getSandwich("xxbreadyy") → ""
