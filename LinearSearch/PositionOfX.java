package LinearSearch;

import java.util.Scanner;

public class PositionOfX {
    static boolean FindIndexOfX(int[] arr, int X){
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == X) {
                System.out.println(i+" ");
                return true;
            }
        }
                return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of th array");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of X");
        int X = sc.nextInt();
        if(!FindIndexOfX(arr,X)){
            System.out.println("Not Found");
        }
    }
}
