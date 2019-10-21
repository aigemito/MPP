package Prog9Prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("Query 1 : Find all transactions from year 2011 and sort them by value (small to high)");
		transactions.stream().filter(x->x.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.forEach(System.out::println);;

        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Query 2: What are all the unique cities where the traders work?");
        transactions.stream().map(x->x.getTrader().getCity()).distinct()
        .forEach(System.out::println);
        
        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("Query 3: Find all traders from Cambridge and sort them by name.");
        transactions.stream().map(x->x.getTrader()).filter(x->x.getCity().equals("Cambridge"))
        .sorted(Comparator.comparing(Trader::getName)).distinct()
        .forEach(System.out::println);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("Query 4: Return a string of all traders names sorted alphabetically.");
        transactions.stream().map(x->x.getTrader().getName()).distinct()
        .sorted().forEach(System.out::println);
  
        // Query 5: Are there any trader based in Milan?
        System.out.println("Query 5: Are there any trader based in Milan?");
        boolean result =transactions.stream().anyMatch(x->x.getTrader().getCity().equals("Milan"));
        System.out.println(result);
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("Query 6: Update all transactions so that the traders from Milan are set to Cambridge.");
        transactions.stream().filter(x->x.getTrader().getCity().equals("Milan"))
        .forEach(x->{x.getTrader().setCity("Cambridge"); System.out.println(x.getTrader().getName());});
        
        // Query 7: What's the highest value in all the transactions?
        System.out.println("Query 7: What's the highest value in all the transactions?");
       int maxValue= transactions.stream().map(Transaction::getValue)
        .reduce(Integer::max).get();
       System.out.println(maxValue);
    }
}
