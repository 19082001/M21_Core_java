package com.cg.framework1;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	//static final private float creditLimit=0.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
	    this.isSalaried=isSalaried;
	    }
		public void withdraw(float charges)
		 {
			 System.out.println("Account No is: "+this.getAccNo()+"Account Name is: "+this.getAccNm()+ "Balance is: "+this.getAccBal());
		 }
		
		@Override
		public String toString() {
			return String.format("SavingAcc [isSalaried=%s]", isSalaried);
		}
	     

}
