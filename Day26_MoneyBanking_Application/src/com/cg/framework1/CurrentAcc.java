package com.cg.framework1;

public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
		public void withdraw(float amount)
		{
			
			float accBal=this.getAccBal();
			if(amount<=creditLimit)
			{
				if(amount<accBal)
				{
					accBal-=amount;
					this.setAccBal(accBal);
					System.out.println("Account No is: "+this.getAccNo()+"Account Name is: "+this.getAccNm()+"withdraw amount is: "+amount+"Balance is: "+(accBal));
				}
				else
				{
					System.out.println("enter amount less than account balance");
				}
			}
			else
			{
				System.out.println("enter credit limit value with amount");
			}
		}
		 
		@Override
		public String toString() {
			return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
		}
		

}
