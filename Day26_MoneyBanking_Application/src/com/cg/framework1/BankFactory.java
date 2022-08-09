package com.cg.framework1;



public abstract class BankFactory {
	 abstract public SavingAcc getNewSavingAcc (int AccNo, String accNm, float  accBal, boolean isSalaried);
	   abstract public CurrentAcc getNewCurrentAcc (int AccNo, String accNm, float accBal, float creditLimit);
}
