public String startWord(String str, String word){
  int A= str.length();
  int B= word.length();

  if(A== 0)
  return "" ;

  if (B>A)
  return "";

  if (word.length()==1)
return str.substring(0,1);

  else if( str.substring(1,B).equals(word.substring(1,B)))
  return str.substring (0,B);

  else
  return "";

}

//Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

//startWord("hippo", "hi") → "hi"
//startWord("hippo", "xip") → "hip"
//startWord("hippo", "i") → "h"
