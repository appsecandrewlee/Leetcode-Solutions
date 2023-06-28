import java.util.*;

class IntersectionofTwoArrays {
    public static void main(String args[]) {

      int[] nums1 = {1,2,2,1,4};
      int[] nums2 = {2,2,4};
    

        List<Integer> list1=new ArrayList<Integer>();  
        List<Integer> list2=new ArrayList<Integer>();  


        //this is a for loop that will loop
        for (int num: nums1){
            list1.add(num);
        }

        for (int num: nums2){
            list2.add(num);
        }        

        list1.retainAll(list2);
        
        int[] n1 = list1.stream().distinct().mapToInt(Integer::intValue).toArray();



        System.out.println(Arrays.toString(n1));

    } 

}
