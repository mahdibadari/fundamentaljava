package javalearning2;

public abstract class Brave {
	public int Gem;
	public int AccountID;
	public String IGN;
	
	public Brave(String ign, int accountId, int gem) {
		IGN = ign;
		AccountID = accountId;
		Gem = gem;
	}
	
	public abstract String GetUnitName();
}
