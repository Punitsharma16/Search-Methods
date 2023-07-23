package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class intersectionOfTwoArrays {
    static boolean Intersection(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return true;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr A");
        int n = sc.nextInt();
        System.out.println("Enter the arr A");
        int[] arrA = new int[n];
        for(int i=0; i<n; i++){
            arrA[i] = sc.nextInt();
        }
        System.out.println("Enter the length of arr B");
        int m = sc.nextInt();
        System.out.println("Enter the arr B");
        int[] arrB = new int[m];
        for(int i=0; i<n; i++){
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrB);
        for(int i=0; i<m; i++) {
            if(Intersection(arrA, arrB[i])){
                System.out.print(arrB[i]+" ");
            }
        }
    }
}
