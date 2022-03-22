package idcard;

import framework.Factory;
import framework.Product;

public class IdcardFactory extends Factory{

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	@Override
	protected void registerProduct(Product product) {
		System.out.println(product +" registered");
	}
	
}
