package Prog10Prob2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(1,38,4,6,9);
		System.out.println("The second smallest integer is :");
		System.out.println(findSecondMax(intList));
		List<String> stringList=Arrays.asList("Amanuel","Emito","Selam","Burk","Desale");
		System.out.println("The second smallest string is :");
		System.out.println(findSecondMax(stringList));
	}

	private static <T extends Comparable<T>> T findSecondMax(List<T> list) {
		if (list==null) return null;
		T max1=list.get(0),max2=list.get(1),temp=null;
		if (max1.compareTo(max2)>0) {
			//swap
			temp=max1;
			max1=max2;
			max2=temp;
		}
		for (int i = 2; i < list.size(); i++) {
			if (list.get(i).compareTo(max1)<0) {
				//swap 
				temp=max1;
				max1=list.get(i);
				max2=temp;
			}else if(list.get(i).compareTo(max2)<0){
				max2=list.get(i);
			}
		}
		return max2;
	}

}
