public int sumNumbers(String str){

  int sum=0;
  String A="" ;
  for(int i=0; i<str.length(); i++)
  {
    if(Character.isDigit(str.charAt(i))){
      if(i< str.length()-1 && Character.isDigit(str.charAt(i+1)))
      {
        A+= str.charAt(i);
      }
      else{
        A +=str.charAt(i);
        sum += Integer.parseInt(A);
        A = "" ;
      }
    }
  }

  return sum;
}

//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

//sumNumbers("abc123xyz") → 123
//sumNumbers("aa11b33") → 44
//sumNumbers("7 11") → 18
