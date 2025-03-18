//Reverse the left and right numbers like
//You must use only a loop
//input 9
//output 4 3 2 1 5 9 8 7 6
//input 13
//6 5 4 3 2 1 7 13 12 11 10 9 8 

import java.util.Scanner;

public class Ex05 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int mid = num / 2;

        for (int i = 0; i < num; i++) {

            if (i < mid) {
                System.out.print((mid - i) + " ");
            } 
            else if (i == mid) {
                System.out.print((i + 1) + " ");
            } 
            else {
                System.out.print((num + (mid-i+1))+ " ");
            }
        }
    }
}
