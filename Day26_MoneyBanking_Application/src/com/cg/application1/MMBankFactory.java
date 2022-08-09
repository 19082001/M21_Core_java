package com.cg.application1;


import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaries) {
		//MMSavingAcc s =new MMSavingAcc(AccNo, accNm, accBal, isSalaries);
		//return s;
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		//MMCurrentAcc c =new MMCurrentAcc(AccNo, accNm, accBal, creditLimit );
		//return c;
		return null;
	}

    
}
