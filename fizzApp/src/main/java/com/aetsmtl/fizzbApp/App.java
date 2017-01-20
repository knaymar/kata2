package com.aetsmtl.fizzbApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
    	String temp;
    	Buzzer buzzer = new Buzzer();
    	sc = new Scanner(System.in);
    	
    	while (true)
    	{
    		System.out.println("\n--Press ctrl+c to stop application--");
    		temp = sc.nextLine();
    		try {
				buzzer.setInputNumber((Integer.parseInt(temp)));
				System.out.println(buzzer.checkFizzBuzz() + "\n");
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("\n--Please enter a valid natural Integer--");
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("\n--Please enter a valid natural Integer--");
			}		
    	}
    }
}
