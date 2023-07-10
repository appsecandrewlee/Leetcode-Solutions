class MinSumFirstTry{
  public static void main(String args[]){
      int num = 2932;
      int new1 = 0;
      int new2 = 0;
      int[] arr = new int[2];
      int min = 0;
      int digit1 = 0;
      int digit2 = 0;
      int digit3 = 0;
      int digit4 = 0;
      int swap = 0;
      int swap2 = 0;
      int First = 0;
      int Second = 0;

      while(num > 0){
        new1 = num/100;
        arr[0] = new1;
        new2 = num%100;
        arr[1] = new2;
        num = 0;
    }
    swap = arr[0];
    swap2 = arr[1];

    digit1 = swap/10;
    digit2 = swap%10;
    digit3 = swap2/10;
    digit4 = swap2%10;

    if (digit1 > digit2){
      First = digit2*10 + digit1;
    }else{
      First = swap;
    }
    
    if(digit3 > digit4){
      Second = digit4*10 + digit3; 
    }
    min = First + Second;
    System.out.println(min);
  } 
}
