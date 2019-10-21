package Prog9Prob7b;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLabrary {
	public static final TriFunction<List<Employee>,Double,Character,Stream<String>> GETEMPLOYEES_STARTWITH=(emps,sal,startWith)->
			emps.stream()
		    .filter(e -> (e.getSalary() > sal) )
		    .filter(e -> (e.getLastName().charAt(0) > startWith))
		    .map(e->e.getfullName())
		    .sorted();
}
