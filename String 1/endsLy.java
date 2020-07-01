public boolean endsLy(String str) {

  int len = str.length();

  String ly = "ly";



  if (len < 2)

    return false;

  else if (ly.equals(str.substring(len-2,len)))

    return true;

  else

    return false;

}

//Given a string, return true if it ends in "ly".

//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false
