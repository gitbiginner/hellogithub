package idcard;
import framework.Product;

public class IDCard extends Product{

	private String owner;
	
	IDCard(String owner){
		System.out.println(owner+" 's card!");
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println(this + " using");
	} 
	
	@Override
	public String toString() {
		return "[IDCard: "+owner+" ]";
	}
	

	public String getOwner() {
		return owner;
	}
}
