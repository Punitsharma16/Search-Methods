package BinarySearch;

import java.util.Scanner;

public class SmallerElement {
    static int smallElements(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = end-1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arr");
        int n = sc.nextInt();
        System.out.println("Enter the arr");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element");
        int key = sc.nextInt();
        System.out.println(smallElements(arr,key));
    }
}
