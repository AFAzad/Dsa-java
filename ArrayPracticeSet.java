public class ArrayPracticeSet {
    public static void main(String [] args){

        int [] marks = {80, 78, 94, 92, 85, 90};
        int num = 55;
        boolean isInArray = false;

        for(int element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            // System.out.println("The value is present in the Array"+" "+num);
        }else{
            // System.out.println("The value is not in the array"+": "+num);
        }

        /*  Q. no 3 : Calculate the average marks from an Array containing marks of all students 
        in physics using "for each loop" */

        int[] markss = {75,84, 98, 96, 91, 89};
        int sum = 0;
        for(int element: markss){
            sum= sum+element;
        }
        System.out.println("The value of Average marks of Physics "+ sum/markss.length);

    }
}
