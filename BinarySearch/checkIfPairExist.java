package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class checkIfPairExist {
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                // el will lie towards
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
    static boolean checkPairExist(int[] arr){
        Arrays.sort(arr);

        for(int j=0; j<arr.length; j++){
            int value = 2*arr[j];

            if(binarySearch(arr, value) != -1){
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        if(checkPairExist(arr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}