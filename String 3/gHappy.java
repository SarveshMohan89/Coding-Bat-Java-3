public boolean gHappy(String str) {
  str=str.replaceAll("ggg", "");
  str=str.replaceAll("gg", "");
  return !str.contains("g");
}

//We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

//gHappy("xxggxx") → true
//gHappy("xxgxx") → false
//gHappy("xxggyygxx") → false
