package BinarySearch;

import java.util.Scanner;

public class SumOfCubes {
    static boolean sumOfCubes(long Num){
        long start = 1;
        long end = (long)Math.cbrt(Num);
        while(start <= end){
            long mid = (start*start*start + end*end*end);
            if(mid == Num){
                return true;
            }
            if(mid < Num){
               start++;
            }
            else{
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long Num = sc.nextInt();
        if(sumOfCubes(Num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
