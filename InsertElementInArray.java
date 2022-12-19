public class InsertElementInArray {
    public static void main(String[] args){
        int[] arr = {10,20,30,50,60};

        int pos = 4;
        int element = 40;

        for(int i = arr.length-1; i > pos-1; i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;

        System.out.println("Modified array is ");

        for(int i =0;i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
