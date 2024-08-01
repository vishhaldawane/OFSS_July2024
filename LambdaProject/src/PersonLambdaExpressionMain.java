
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class FirstNameComparator implements Comparator<Person> { 
	public int compare(Person p1, Person p2) {
		return p1.getFirstName().compareTo(p2.getFirstName());
	}
}

public class PersonLambdaExpressionMain {

	public static void printConditionally(
			List<Person> persons, 
			Predicate<Person> predicate,
			Consumer<Person> consumer) {
		
		for (Person person : persons) {
			if (predicate.test(person))
				consumer.accept(person);

		}
	}

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList
				(
					new Person("Gokul", "S", 23), 
					new Person("Hari", "T", 22),
					new Person("Anand", "K", 22), 
					new Person("Poorna Chanda", "P", 22), 
					new Person("Rishabh", "Tiwari", 23),
					new Person("Shiva Prasad", "G", 23)
				);
		System.out.println("1. Sort all persons object by its FirstName");
		//Comparator<Person> cmp = new FirstNameComparator();
		//Collections.sort(persons, cmp);

		
		Collections.sort(persons, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		System.out.println();
		System.out.println("2. Create a function to print all persons and call it from main");
		printConditionally(
				persons, 
				(p) -> true, 
				p -> System.out.println(p)
		);
		printConditionally(persons, p -> true, System.out::println);

		System.out.println();
		System.out.println("3. Create a function to print persons whos last name starts with T");
		printConditionally(persons, (p) -> p.getLastName().startsWith("T"), p -> System.out.println(p));

		System.out.println();
		System.out.println("4. Create a function to print persons whos first name ends with d");
		printConditionally(persons, (p) -> p.getFirstName().endsWith("d"), p -> System.out.println(p));

	}
}
