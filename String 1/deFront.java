public String deFront(String str) {
  int len= str.length();
  String A= "";

  for (int i=0; i<len; i++ )
  {
   if (i == 0 && str.charAt(i) == 'a')

      A += 'a';

    else if (i == 1 && str.charAt(i) == 'b')

      A += 'b';

    else if (i > 1)

    A += str.charAt(i);

  }

    return A;

}

//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

//deFront("Hello") → "llo"
//deFront("java") → "va"
//deFront("away") → "aay"
