public boolean xyzThere(String str) {
int x = 0;
int y = 0;
if (str.length() < 3 || str.endsWith(".xyz") ||
str.endsWith("xy"))
{
return false;
}
if (str.startsWith("xyz"))
{
return true;
}

return true;
}

//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

//xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true
