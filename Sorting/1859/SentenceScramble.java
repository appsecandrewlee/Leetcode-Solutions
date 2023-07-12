import java.util.Scanner; 
import java.util.Random;
import java.util.*;

class SentenceScramble{
    public static void main(String args[]){
        String s = "This is a sentence";
        ArrayList<String> arr = new ArrayList<String>();
        int count = 1; 

            for(String iterator: s.split(" ")){
              arr.add(iterator + count);
              count++;

            }
              Collections.shuffle(arr);
              StringBuilder sb = new StringBuilder();
              for(String word: arr){
                  sb.append(word).append(" ");    
              } 



    String shuffled = sb.toString().trim();
    System.out.println(shuffled);
  }  
}

