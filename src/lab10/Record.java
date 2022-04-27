package lab10;

public class Record {
	private String custID;
	private String custName;
	private int bonusPoint;
	
	public Record (String custID, String custName, int bonusPoint) {
		this.bonusPoint = bonusPoint;
		this.custID = custID;
		this.custName = custName;
	}
	
	public Record() {
		this("","",0);
	}
	
	String getCustID() {
		return this.custID;
		
	}
	
	String getCustName() {
		return this.custName;
	}
	
	int getBonusPoint() {
		return this.bonusPoint;
	}
	
	String tostring() {
		return "custId: "+this.custID+" Name: "+this.custName+" have "+this.bonusPoint+" bonus point.";
	}
	
	
}
