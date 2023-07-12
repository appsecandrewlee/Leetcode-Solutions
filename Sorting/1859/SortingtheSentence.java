import java.util.*;


class SortingtheSentence{
  public static void main(String args[]){
  
    String s = "This1 sentence4 is2 a3";
    //we want to iterate through the string
    //then we want to see the split " " and count that as a word
    //then we want to iterate each word to find the number
    //and then sort the number, and based on the sorted number, put it in an new String 
    //then print it out 
    String[] words = s.split(" "); 

    Arrays.sort(words, new Comparator<String>(){   //comparison operator 
      
      @Override
      public int compare(String firstword, String secondword){ 
        return firstword.charAt(firstword.length()-1) - secondword.charAt(secondword.length() - 1);

      }
    });

    String sorted = String.join(" ", words);

    char[] charArray = sorted.toCharArray();
    String res = ""; 

    for (int i = 0; i < charArray.length; i++){

        if(!Character.isDigit(charArray[i])){ 
            res = res + charArray[i];
      }
    }
    System.out.println(res);
    }
  }
    
