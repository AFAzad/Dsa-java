import java.util.*;

// import java.util.*;
// public class Array {

//     public static void main(String args[]){
//         // int[] num = {70, 85, 69};

//         // for(int i = 0; i <3; i ++){
//         //     System.out.println(num[i]);
//         // }

//         // Scanner sc = new Scanner (System.in);
//         // int size = sc.nextInt();
//         // int numbers[] = new int[size];

//         // for(int i = 0; i < size; i++){
//         //     System.out.println(numbers[i]);
//         // }

//     }
    
// }


/*  Q.no.1:-  Take an array of names as input from the user and print on the screen */

public class Array  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i = 0; i < name.length; i ++){
            name[i]= sc.next();
        }

        for(int i =0; i < name.length; i++){
            System.out.println("name" + (i +1) + "is :" + name[i] );
        }
    }
}
