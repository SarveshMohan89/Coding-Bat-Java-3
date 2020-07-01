public String withoutX2(String str) {

  String A = "";



  for (int i = 0; i < str.length(); i++) {

    if (i == 0 && str.charAt(i) != 'x')

     A+= str.charAt(i);

    else if (i == 1 && str.charAt(i) != 'x')

     A += str.charAt(i);

    else if (i > 1)

      A += str.charAt(i);

  }



  return A;

}

//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

//withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi"
