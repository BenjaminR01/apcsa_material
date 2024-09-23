public class MyStringMethods{

  // IndexOf returns the index (position) of the first occurence of the characters it is searching for. It returns an int value.
  // Then implement your own myIndexOf
  public static int myIndexOf(String myString, String targetString){
    int index = -1;  
    for (int i = 0; i < myString.length(); i++){
      if (myString.substring(i, i + targetString.length()).equals(targetString)){
        index = i;  
        i = myString.length();
      }
      else{
          index = -1;
      }
    }
    return index;
  }                          

  // CompareTo compares two strings based off of the ASCII values of each character in the strings. If they are equal, 0 is returned. If the second string has more characters than the first, then the amount of extra characters will be returned.
  // Then implement your own myCompareTo
  public static int myCompareTo(String myString, String otherString){
    int result = 0;
    if (myString.length() == otherString.length()){
      for (int i = 0; i < myString.length(); i++){
        if (myString.substring(i, i+1).equals(otherString.substring(i, i+1))){
          result = 0;
        }
        else{
          result = (int) (myString.charAt(i) - otherString.charAt(i));
        }
      }
    }
    else{
      result = myString.length() - otherString.length();
    }
    return result;
  }

  // parseInt turns a String into a primitive int.
  // Then implement your own myParseInt()
 public static int myparseInt(String myString){
   int digits = 0;
   for (int i = 0; i < myString.length(); i++){
     if (Character.isDigit(myString.substring(i, i+1)) == true){
       digits += 1;
     }
   }
   if (digits = myString.length()){
     int newInt = (int) myString;
   }
   return newInt
 }
