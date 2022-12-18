public class ReverseArray {
    public static void main(String[] args){
        
        int[] arr = {10, 20, 30,40,50,90, 60, 70};

        int l = arr.length;

        int n = Math.floorDiv(l,2);

        int temp;

        for(int i = 0; i <n; i++){
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1] = temp;

        }
        
        System.out.println("The reverse Array is ");
        for(int element: arr){
            
            System.out.print(element+" ");
        }
    }
}
