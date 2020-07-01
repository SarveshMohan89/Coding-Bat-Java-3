public int countHi(String str) {
  int count = 0;
 if (str.length()==1 && str.charAt(0) == 'h')

  count=0;

  else {
    for(int i=0; i< str.length(); i++){
    if((str.charAt(i) == 'h') &&(str.charAt(i+1) == 'i'))
     count +=1;
  }
  }
  return count ;

}

//Return the number of times that the string "hi" appears anywhere in the given string.

//countHi("abc hi ho") → 1
//countHi("ABChi hi") → 2
//countHi("hihi") → 2
