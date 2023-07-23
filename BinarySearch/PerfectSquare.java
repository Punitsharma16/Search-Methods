package BinarySearch;

import java.util.Scanner;

public class PerfectSquare {
    static boolean CheckSquare(int num){
        if(num >=0){
            int sRoot = (int)Math.sqrt(num);
            return ((sRoot*sRoot)==num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(CheckSquare(num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
