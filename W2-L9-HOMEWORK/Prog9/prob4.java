package Prog9;


import java.util.stream.IntStream;

public class prob4 {
	
	public static void main(String[] args) {	
		printSquares(4);
	}
	public static void printSquares(int limit) {
		IntStream squares = IntStream.iterate(1, n -> n+1).map(n->n*n).limit(limit);
		
		squares.forEach(System.out::println);
		
		
	}
	
	
}
