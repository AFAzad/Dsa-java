public class ArrayPractice{
    public static void main(String args[]){
        int[] Arr = {50,5,10,20,15,40,25,60,30};
        int max = Arr[0];
        // Max n Element in the array
        for(int i = 1; i <Arr.length;i++){
            if(Arr[i]>max){
                max = Arr[i];
            }
        }
        System.out.println("Max number is " +max);
    // Min Element in the array
        int min= Arr[0];
    
        for(int i = 1;i<Arr.length; i++){
            if(Arr[i]<min){
                min = Arr[i];
            }
        }
        System.out.println("The Min num is" +min);

        float [] marks = {70.6f, 68.7f,83.5f, 98.6f,100.00f};
        float sum = 0;

        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The value of the sum is " + sum);
    
    }
}