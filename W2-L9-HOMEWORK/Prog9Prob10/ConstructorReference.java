package Prog9Prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), 
			new Human("Jane",45,"Female"), 
			new Human("John",30,"Male")};
    // Query 1  : Print only Female canditates names
	System.out.println("Query 1  : Print only Female canditates names");
	Arrays.stream(list).filter(p -> p.getGender().equals("Female"))
	.map(Human::getName)
	.forEach(System.out::println);

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
	System.out.println("Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status ");
	 Function<String, Human> function = Human::new;
	 Human ob = function.apply("Amanuel");
	 System.out.println(ob);
	 
	 BiFunction<String,Integer, Human> function1 = Human::new;
	 Human ob1 = function1.apply("Amanuel",30);
	 System.out.println(ob1);
	 
	 TriFunction<String,Integer,String, Human> function3 = Human::new;
	 Human ob2 = function3.apply("Julius",28,"Male");
	 System.out.println(ob2);
	 
	// Query 3 : Count the male candidates whose age is more than 30
	System.out.println("Query 3 : Count the male candidates whose age is more than 30"); 
	Long totalMales=Arrays.stream(list).filter(p -> p.getGender().equals("Male") && p.getAge()>30)
	.count();
	System.out.println(totalMales);
	
	
}
}
