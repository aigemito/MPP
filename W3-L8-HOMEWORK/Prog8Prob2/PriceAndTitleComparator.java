package Prog8Prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriceAndTitleComparator {
	static enum sortMethode {
		BYPRICE, BYTITLE
	}

	// sort method with one type of Comparator
	public void sort(List<Product> product, sortMethode method) {
		class Productomparator implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				if (method == sortMethode.BYTITLE) {
					return o1.getTitle().compareTo(o2.getTitle());
				} else {
					if (o1.getPrice() == o2.getPrice())
						return 0;
					else if (o1.getPrice() < o2.getPrice())
						return -1;
					else
						return 1;
				}

			}

		}

		Collections.sort(product, new Productomparator());
	}

	public static void main(String[] args) {
		List<Product> product = new ArrayList<>();
		product.add(new Product("Samsung Calaxy", 200.75, 2015));
		product.add(new Product("Apple IPod", 300.56, 2014));
		product.add(new Product("Sony TV", 340.78, 2012));
		product.add(new Product("LG Smart", 310.43, 2015));

		PriceAndTitleComparator pt = new PriceAndTitleComparator();
		// pt.sort(product, PriceAndTitleComparator.sortMethode.BYPRICE);
		pt.sort(product, PriceAndTitleComparator.sortMethode.BYTITLE);
		System.out.println(product);
	}

}
