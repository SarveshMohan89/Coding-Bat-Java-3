public String repeatSeparator(String word, String sep, int count) {
  String A= "" ;
  for (int i=0; i< count; i++){

    if (i<count-1)

    A+= word+ sep;

    else
     A+= word;

  }
  return A;

}

//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

//repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//repeatSeparator("This", "And", 2) → "ThisAndThis"
//repeatSeparator("This", "And", 1) → "This"
