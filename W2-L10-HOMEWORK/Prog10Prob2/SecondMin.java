package Prog10Prob2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(1,38,4,6,9);
		System.out.println("The second smallest integer is :");
		System.out.println(findSecondMin(intList));
		List<String> stringList=Arrays.asList("Amanuel","Emito","Selam","Burk","Desale");
		System.out.println("The second smallest string is :");
		System.out.println(findSecondMin(stringList));
	}

	private static <T extends Comparable<? super T>> T findSecondMin(List<T> list) {
		if (list==null) return null;
		T min1=list.get(0),min2=list.get(1),temp=null;
		if (min1.compareTo(min2)>0) {
			//swap
			temp=min1;
			min1=min2;
			min2=temp;
		}
		for (int i = 2; i < list.size(); i++) {
			if (list.get(i).compareTo(min1)<0) {
				//swap 
				temp=min1;
				min1=list.get(i);
				min2=temp;
			}else if(list.get(i).compareTo(min2)<0){
				min2=list.get(i);
			}
		}
		return min2;
	}

}
