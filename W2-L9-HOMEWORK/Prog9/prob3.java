package Prog9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob3 {
	
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(x->x.length()==len && x.indexOf(c)!=-1 && x.indexOf(d)==-1).count();
		//Other option by x.contains(""+c) or x.contains(String.ValueOf(c))
		
	}
	public static void main(String[] args) {

		List<String> words= Arrays.asList("amanu","emito","selam");
		System.out.println((new prob3()).countWords(words, 'a', 'i', 5));
	}

}
