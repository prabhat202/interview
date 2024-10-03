package interview1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStream {

	public static void main(String[] args) {
		// Create a list of persons with addresses
		List<Person> people = Arrays.asList(
				new Person("Alice", 25,
						Arrays.asList(new Address("India"), new Address("New York"), new Address("London"))),
				new Person("Bob", 17, Arrays.asList(new Address("Paris"), new Address("Tokyo"))),
				new Person("Charlie", 30, Arrays.asList(new Address("New York"), new Address("Sydney"))));

		// get distinct cities of persons having age greater than or equal to 18
		// output - [India, New York, London, Sydney]
		// write you code below

		List<String> ll = people.stream().filter(p -> p.getAge() >= 18).flatMap(p -> p.getAddresses().stream()).map(ad -> ad.getCity()).distinct().collect(Collectors.toList());
		
		ll.stream().forEach(a -> {
			System.out.println(a);
		});
	}

}

class Person {
	private String name;
	private int age;
	private List<Address> addresses;

	public Person(String name, int age, List<Address> addresses) {
		this.name = name;
		this.age = age;
		this.addresses = addresses;
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}

class Address {
	private String city;

	public Address(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
