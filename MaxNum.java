public class MaxNum {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,80,5, 98};
        
       /* max num */
        int max = arr[0];

        for(int i = 1; i <arr.length;i++){
            if(max <arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The max number in the array is " +" "+ max);
        
        // min num
        int min = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(min >arr[i]){
                min= arr[i];
            }
        }
        System.out.println("The min element in the Array is "+" "+ min);

        /* Done Sir Also find the min element in the array */
    }
    
}
