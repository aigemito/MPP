package Prog9Prob9;

import java.util.Optional;

public class TestDriver {

	public static void main(String[] args) {
		
		//a. Is there any Vegetarian meal available ( return type boolean)
		 System.out.println("a. Is there any Vegetarian meal available ( return type boolean)");
		 boolean isThereAnyVegeterian=Dish.menu.stream().anyMatch(Dish::isVegetarian);
		 System.out.println(isThereAnyVegeterian);
		//b. Is there any healthy menu have calories less than 1000 ( return type boolean)
		 System.out.println("b. Is there any healthy menu have calories less than 1000 ( return type boolean)");
		 boolean isThereAnyHealthy=Dish.menu.stream().allMatch(x->x.getCalories()<1000);
		 System.out.println(isThereAnyHealthy);
		//c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
		 System.out.println("c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)");
		 boolean isThereAnyUnHealthy=Dish.menu.stream().noneMatch(x->x.getCalories()>=1000);
		 System.out.println(isThereAnyUnHealthy);
		 //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
		 System.out.println("d. find and return the first item for the type of MEAT( return type Optional<Dish>)");
		 Optional<Dish> findFirst=Dish.menu.stream().filter(d-> d.getType()==Dish.Type.MEAT).findFirst();
		 findFirst.ifPresent(System.out::println);
		//e. calculateTotalCalories() in the menu using reduce. (return int)
		 System.out.println("e. calculateTotalCalories() in the menu using reduce. (return int)");
		int totalCalories=Dish.menu.stream().map(x->x.getCalories())
		.reduce(0,(a,b)->(a+b));
		System.out.println(totalCalories);
		 //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
		System.out.println("f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)");
		int totalCaloriesByRef=Dish.menu.stream().map(Dish::getCalories)
				.reduce(0,Integer::sum);
				System.out.println(totalCaloriesByRef);
		

	}

}
