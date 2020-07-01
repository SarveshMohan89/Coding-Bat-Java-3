public int countCode(String str) {
  int count = 0;
  String A= "co";
  String B= "e";

  if(str.length()<4)
  return 0;

  for( int i=0; i< str.length()-3; i++)
  {
 if (A.compareTo(str.substring(i, i+2)) ==0 && B.compareTo(str.substring(i+3,i+4)) ==0)

    count++ ;

  }

  return count;

}

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

//countCode("aaacodebbb") → 1
//countCode("codexxcode") → 2
//countCode("cozexxcope") → 2
