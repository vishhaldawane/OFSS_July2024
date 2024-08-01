
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Gokul", "S", 23), new Person("Hari", "T", 22),
				new Person("Anand", "K", 22), new Person("Poorna Chanda", "P", 22), new Person("Rishabh", "Tiwari", 23),
				new Person("Shiva Prasad", "G", 23));

		// For loop
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		System.out.println("----------------------------");
		// for each
		for (Person person : persons) {
			System.out.println(person);
		}

		System.out.println("---------------------");
		persons.forEach(
				
				new Consumer<Person>() 
				{
						@Override
						public void accept(Person p) {
								System.out.println(p);
						}

				}
		);
		System.out.println("---------------------");
		persons.forEach((p) -> System.out.println(p));

	}
}















