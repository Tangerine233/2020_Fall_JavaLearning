/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 8B
*/

import java.util.*;
public class Lab8B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int arrSize = 15;
        int[] arr = new int[arrSize];
        int temp =0;
        int target =0;
        int first =0;
        int last =0;
        int mid =0;

        //input values in 'arr[]'
        for (int i =0; i<arrSize; i++){
            System.out.print("Enter slot " + i + ": ");
            arr[i] = input.nextInt();
        }

        //input 'target'
        System.out.print("Enter a target: ");
        target = input.nextInt();



        //display sorted 'arr[]'
        for (int i =0; i<arrSize; i++) System.out.print(arr[i] + "|");
        System.out.println("");

        //linear search
        for (int i =0; i<arrSize; i++){
            System.out.print(i+" ");
            if (arr[i]==target) break;
        }
        System.out.println("");

        //binary search
        first =0;
        last = arrSize-1;
        mid = (first+last)/2;
        while (first<=last){
            if (target==arr[mid]){
                System.out.print(mid);
                break;
            }
            else if (target<arr[mid]){
                System.out.print(mid + " ");
                last = mid-1;
                mid = (first+last)/2;
            }
            else if (target>arr[mid]){
                System.out.print(mid + " ");
                first = mid+1;
                mid =(first+last)/2;
            }
        }

        //reclaim resource
        input.close();
    }
}
