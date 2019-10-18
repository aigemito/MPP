package Prog8Prob2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
//		if(o1.getPrice() == o2.getPrice()) return 0;
//		else if(o1.getPrice()< o2.getPrice()) return -1;
//		else return 1;
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
