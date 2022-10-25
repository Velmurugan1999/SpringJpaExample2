package com.bike;

import java.util.Scanner;

import com.bike.dao.BikeDao;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BikeDao obj=new BikeDao();
		while (true) {
			System.out.println("Enter\n1)->print all bike\n2)->insert new bike\n3)->delete the bike\n4)->get bike details by id");
			int i = Integer.parseInt(sc.nextLine());
			if (i == 1)
				obj.printall();
			else if (i == 2)
				obj.insert();
			else if (i == 3)
				obj.delete();
			else if (i == 4)
				obj.getbyId();
			else
				break;

		}
		sc.close();
		obj.end();
	}

}
