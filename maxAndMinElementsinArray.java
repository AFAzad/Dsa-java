public class maxAndMinElementsinArray {
    public static void main(String args[]){
        //max number 

        int a[] = {40,60, 30, 50, 70};
        int max = a[0];
        for(int i = 1; i <a.length; i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println("The max element in this array is  " +max);


        //min number
        int min = a[0];
        for(int i =1; i<a.length; i++){
            if(a[i]<min){
                min= a[i];
            }
        }
        System.out.println("The min element of this Array is " + min);

        int Arr[] = {10,20,30,40,80,25,5};

        int maxNum = Arr[0];

        for(int i = 1; i < Arr.length; i++){
            if(Arr[i]>max){
                maxNum= Arr[i];
            }
        }
        System.out.println("The max num of the Element in the Array is "+ maxNum);

        //min num 

        int minNum = Arr[0];
        
        for(int i = 1; i < Arr.length; i++){
            if(Arr[i]<minNum){
                minNum= Arr[i];
            }
        }
        System.out.println("The min num of the Element is " + minNum);

        

    }
    
}
