package BinarySearch;

import java.util.Scanner;

public class SearchANumber {
    static int number(int[] arr, int num){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == num){
                return 1;
            }
            if(arr[mid] < num){
                start = start+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(number(arr,num));
    }
}
