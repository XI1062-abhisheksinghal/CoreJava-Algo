package com.mckc.recursion;

import java.util.Scanner;

public class TowerOfhanoi {
	
	//Three rods A,B,C are given with three disks 
	//Initial position of all 3 disk is on rod A 
	//Intent is to move all the disk to another rod , condition small disk cannot be placed over big disk .
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter no of discs");
		Scanner sc = new Scanner(System.in);
		int noOfDiscs= sc.nextInt();
		shift(noOfDiscs, "Pole1", "Pole2", "Pole3");
	}
	
	public static void shift(int n, String startPole, String intermediatePole, String endPole)
    {
        if (n == 0)
        {
            return;
        }
        shift(n - 1, startPole, endPole, intermediatePole);
        System.out.println("Move \"" + n + "\" from " + startPole + " --> " + endPole);
        shift(n - 1, intermediatePole, startPole, endPole);
    }

}
