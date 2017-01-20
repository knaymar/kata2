package com.aetsmtl.fizzbApp;

public class Buzzer {
	
	private int inputNumber ;
	
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String BUZZFIZZ = "fizzBuzz";
	
	public Buzzer() 
	{
		super();
	}

	public Buzzer(int value) 
	{
		this.inputNumber = value;
	}
	
	public int getInputNumber() {
		return inputNumber;
	}

	public void setInputNumber(int inputNumber)
	throws Exception
	{
		if (inputNumber < 0)
		{
			throw new Exception("You must enter a positive integer");
		}
		this.inputNumber = inputNumber;
	}

	public String checkFizzBuzz() 
	{
		if (inputNumber % 3 == 0 && inputNumber % 5 == 0)
			return BUZZFIZZ;
		else if (inputNumber % 5 == 0)
			return BUZZ;
		else if (inputNumber % 3 == 0)
			return FIZZ;
		else 
			return String.valueOf(inputNumber);	
	}
	
}
