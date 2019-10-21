package Prog9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob5 {

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n+1).skip(m);
		//return stream.skip(m).limit(n-m+1)
	}
	
	public static void main(String[] args) {
		System.out.println(streamSection(nextStream(), 1, 5).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 5, 8).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 3, 9).collect(Collectors.joining(", ")));	
	}
	
	
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
