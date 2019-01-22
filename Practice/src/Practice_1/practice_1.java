package Practice_1;

public class practice_1 {
   public static void main(String[] args){
       int[] arr={1,2,3,4,5,6,7,8,9};
       int index=halfSearch(arr,5);
       System.out.println("index="+index);
   }
   public static int halfSearch(int[] arr,int key){
      int max,min,mid;
      min=0;
      max=arr.length-1;
      while(min<=max){
          mid=(min+max)>>1;
          if(arr[mid]<key)
              min=mid+1;
          else if(arr[mid]>key)
              max=mid-1;
          else return mid;
      }
      return -1;
   }
}
