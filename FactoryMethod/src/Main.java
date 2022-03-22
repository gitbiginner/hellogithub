import framework.Product;
import framework.Factory;
import idcard.IdcardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory  = new IdcardFactory();
		Product card1 = factory.create("minato");
		Product card2 = factory.create("Tatuya");
		
		card1.use();
		card2.use();
	}
}
