package oop;

public class AccountBalance {
	private int WithdrawAmt;

	public int getWithdrawAmt() {
		return WithdrawAmt;
	}

	public void setWithdrawAmt(int withdrawAmt) {
		if (WithdrawAmt > 500) {
			throw new RuntimeException("Invalid Amount. Exceeds daily allowed withdrawal amount.");
		}
		
	}
	

}
