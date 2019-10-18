package Prog8Prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TitleModelComparator {
 // static enum sortMethode{BYPRICE,BYTITLE}
 // sort method with one type of Comparator 
	  public void sort(List<Product> product) {
		 Collections.sort(product,(Comparator<? super Product>) ( p1,  p2)->{
			if(p1.getTitle()!=p2.getTitle()) {
			return p1.getTitle().compareTo(p2.getTitle());
			}
			return Integer.compare(p1.getModel(),p2.getModel());
		 });
	  }
	  
	
		public static void main(String[] args) {
			List<Product> product = new ArrayList<>();
			product.add(new Product("Samsung Calaxy", 200.75,2015));
			product.add(new Product("Apple IPod", 300.56,2014));
			product.add(new Product("Sony TV", 340.78,2012));
			product.add(new Product("LG Smart", 310.43,2015));
			product.add(new Product("LG Smart", 310.43,2000));
			TitleModelComparator pt= new TitleModelComparator();
			//pt.sort(product, PriceAndTitleComparator.sortMethode.BYPRICE);
			pt.sort(product);
			System.out.println(product);
		}
	  
	  
		  }
	  
		  


