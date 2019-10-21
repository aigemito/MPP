package Prog9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob2 {

	public static void main(String[] args) {
		IntSummaryStatistics myIntStream=IntStream.of(1,2,4,5).summaryStatistics();
		//IntSummaryStatistics myIntStream1=Stream.of(1,2,4,5).collect(Collectors.summarizingInt(n->n));
		System.out.println("The max number is :" + myIntStream.getMax());
		System.out.println("The min number is :" + myIntStream.getMin());
	}

}
