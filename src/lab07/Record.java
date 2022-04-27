package lab07;

public class Record<T> {
	private String custId;
	private int mobileN;
	private int BonusP;
	
	public Record(String custId, int mobileN, int BonusP){
		this.custId = custId;
		this.mobileN = mobileN;
		this.BonusP = BonusP;
	}
	
	public Record() {
		this("", 0 , 0);
	}
	
	public String getCustId() {
		return this.custId;
	}
	
	public int getMobileN() {
		return this.mobileN;
	}
	
	public int getBonusP() {
		return this.BonusP;
	}
	
	public String toString() {
		return "The record is "+ this.custId + ", " +this.mobileN +", "+this.BonusP;
	}
}
