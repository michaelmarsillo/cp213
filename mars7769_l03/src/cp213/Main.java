package cp213;

import java.time.LocalDate;

/**
 * Tests the Student class.
 *
 * @author Michael Marsillo
 * @version 2022-01-17
 */
public class Main {

    public static void main(String[] args) {
	final String line = "-".repeat(40);
	int id = 123456;
	String surname = "Brown";
	String forename = "David";
	LocalDate birthDate = LocalDate.parse("1962-10-25");
	Student student = new Student(id, surname, forename, birthDate);
	System.out.println("New Student:");
	System.out.println(student);
	System.out.println(line);
	System.out.println("Test Getters");

	// call getters here
	System.out.println("ID: " + student.getId());
	System.out.println("Surname: " + student.getSurname());
	System.out.println("Forename: " + student.getForename());
	System.out.println("Birthdate: " + student.getBirthDate());

	System.out.println(line);
	System.out.println("Test Setters");

	// call setters here
	student.setId(169057);
	student.setSurname("Marsillo");
	student.setForename("Michael");
	student.setBirthDate(LocalDate.parse("2005-06-11"));

	System.out.println("Updated Student:");
	System.out.println(student);
	System.out.println(line);
	System.out.println("Test compareTo");

	// create new Students - call comparisons here
	Student student2 = new Student(420420, "Pork", "John", LocalDate.parse("1969-06-09"));

	int compare = student.compareTo(student2);

	System.out.print("Comparing student and student2: \n");

	if (compare < 0) {
	    System.out.print("student comes before student2");
	} else if (compare > 0) {
	    System.out.print("student2 comes before student");
	} else {
	    System.out.print("student and student2 are equal");
	}

	int compare2 = student.compareTo(student2);
	System.out.print("\n");
	System.out.print(line + "\n");
	System.out.print(compare2); // since output is -3 student comes before student2

    }

}
