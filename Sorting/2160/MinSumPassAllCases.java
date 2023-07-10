import java.util.Arrays;   

class MinSumPassAllCases{
    public static void main(String args[]) {
        int num = 2687;
        int new1 = 0;
        int[] arr = new int[4];
        int min = 0;  
        int firstElement = 0;
        int SecondElement = 0;
        int count = 0;
        while(num > 0){
            new1 = num % 10;
            num = num/10;
            arr[count++] = new1;
        }
        Arrays.sort(arr);
        firstElement = arr[0] * 10 + arr[2];
        SecondElement = arr[1] * 10 + arr[3]; 
        min = firstElement + SecondElement;
        System.out.println(min);
  }
}
