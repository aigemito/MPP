package Prog10Prob3;
import java.util.*;
import java.util.function.*;


public class Main {
	//could return list.contains(s), but this does not generalize
	@SuppressWarnings("unused")
	private static<T> boolean contains(List<? extends T> list, T t,
			BiPredicate<? super T,? super T> pred) {
		for(T x: list) {
			if(x == null && t == null) return true;
			if(x == null || t == null) continue;
			if(pred.test(x,t)) return true;
		}
		return false;	
		
	}
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}
	
	public static boolean contains2(List<Employee> list, Employee e, 
			BiPredicate<Employee,Employee> pred2) {
		for(Employee emp: list) {
			if(emp == null && e == null) return true;
			if(emp == null || e == null) continue;
			if(pred2.test(emp, e)) return true;
		}
		return false;	
	}
	private static boolean contains3(List<Manager> list, Manager m,
			BiPredicate<Employee,Employee> pred3) {
		for(Manager manager: list) {
			if(manager == null && m == null) return true;
			if(manager == null || m == null) continue;
			if(pred3.test(manager, m)) return true;
		}
		return false;	
		
	}
	private static boolean contains4(List<Manager> list, Manager m,
			BiPredicate<Employee,Person> pred4) {
		for(Manager manager: list) {
			if(manager == null && m == null) return true;
			if(manager == null || m == null) continue;
			if(pred4.test(manager, m)) return true;
		}
		return false;	
		
	}
	private static boolean contains5(List<CheckingAccount> list, Account a,
			BiPredicate<Account,Account> pred5) {
		for(Account act: list) {
			if(act == null && a == null) return true;
			if(act == null || a == null) continue;
			if(pred5.test(act,a)) return true;
		}
		return false;	
		
	}
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		Employee e = new Employee(1001, "Joe", 50000);
		boolean foundIt = Main.contains(list, e, (e1,e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains(list, m, 
				(Employee e1, Employee e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	

	public static void test4() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains(list, m, 
			(Employee e, Person p) -> e.getName().equals(p.getName()));
		System.out.println(foundIt);		
	}
	
	public static void test5() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		
		Account a = new CheckingAccount(1002, 35.00);
		boolean foundIt = Main.contains(list, a, 
			(Account a1, Account a2) -> a1.getAcctId()==a2.getAcctId());
		System.out.println(foundIt);		
	}
	
	
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}	
		
		
	
}
