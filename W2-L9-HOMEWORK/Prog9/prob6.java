package Prog9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class prob6 {

	public Set<String> union(List<Set<String>> sets)  {
		return sets.stream().reduce( (a, b) -> {
			a.addAll(b); 
			return a;
			}).orElse(Collections.emptySet());
		//return sets.stream().flatMap(n->n.stream()).collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		prob6 u = new prob6();
		Set<String> set1  = new TreeSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		Set<String> set2  = new TreeSet<>();
		set1.add("D");
		set2.add("2");
		
		Set<String> set3  = new TreeSet<>();
		set3.add("1");
		set3.add("3");
	
		List<Set<String>> list = Arrays.asList(set1,set2,set3);
		
		System.out.println(u.union(list));

	}

}
