package entities;

public class Money {

	private String name;
	private  int account;
	private double deposit;
	
	public Money(){
	}
	public Money(String name, int account) {
		this.name = name;		
		this.account = account;
	}
	public Money(String name, int account, double initial) {
		this.name = name;
		this.account = account;
		in(initial);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void in (double money) {
		deposit += money;
	}
	public void out(double money) {
		deposit -= money + 5.0;   
	}
    public String toString(){
    	return
    	+ account
    	+", "
    	+"Holder: "
    	+ name
    	+", "
    	+"Balance: $ "
    	+ String.format("%.2f",deposit);
	
    }
}
