package com.cg.client1;

import com.cg.application1.MMBankFactory;
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class Client1 {

	public static void main(String[] args) {
		{
			BankFactory b=new MMBankFactory();
			SavingAcc s=new MMSavingAcc (3245,"Snehal ",30000, true);
			CurrentAcc c=new MMCurrentAcc (1221,"Gauri",55000,30000);
			
			
			System.out.println("Saving Account: ");
			s.withdraw(10000);
			
			System.out.println("Current Account: ");
			c.withdraw(10000);
			System.out.println(s);
			System.out.println(c);
			
			
		}
	

	}

}
