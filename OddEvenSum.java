package in.co.nmsworks;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("Enter  " + num + " Number : ");
        int enterValue, evenResult = 0, oddResult = 0;
        for (int i = 1; i <= num; i++) {
            enterValue = sc.nextInt();
            if (enterValue % 2 == 0) {
                evenResult += enterValue;
            } else {
                oddResult += enterValue;
            }
        }
        System.out.println("Sum of Even is : " + evenResult);
        System.out.println("Sum of Odd is : " + oddResult);
    }
}
