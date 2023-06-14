package package_lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Lab8Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap so "+(i+1)+": ");
            int n = input.nextInt();
            list.add(n);
        }
        System.out.println("=====");
        for (int i : list) {
            System.out.print(i + "  ");
        }
        
    }

}