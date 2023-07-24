package BinarySearch;

import java.util.Scanner;

public class FindIt {
    static long findIt(long Num){
        long start = 1;
        long end = 999999999;
        while(start <= end){
            long mid = (start + end)/2;
            if(mid*mid + 3*mid == Num){
                return mid;
            }
            else if(mid*mid + 3*mid <Num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long Num = sc.nextInt();
        System.out.println(findIt(Num));
    }
}
