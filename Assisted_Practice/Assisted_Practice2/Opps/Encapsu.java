package Assisted_Practice2.Opps;

class EncapsTest{
	
	private int sc;
	private String bn;
	private int bc;
	private String dn;
	private int di;
	
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public String getBn() {
		return bn;
	}
	public void setBn(String bn) {
		this.bn = bn;
	}
	public int getBc() {
		return bc;
	}
	public void setBc(int bc) {
		this.bc = bc;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public int getDi() {
		return di;
	}
	public void setDi(int di) {
		this.di = di;
	}
	
	
}

public class Encapsu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsTest  obj = new EncapsTest();
		obj.setSc(1234);
		obj.setBn("CSC");
		obj.setBc(231);
		obj.setDn("MCA Dept.");
		obj.setDi(546);
		System.out.println("Section Code : "+ obj.getSc() + " Branch Name : "+obj.getBn()+" Branch Code : "+obj.getBc() + " Department Id : "+obj.getDi() + " Department Name : "+obj.getDn());

	}
}

