package cp213;

import java.time.LocalDate;

/**
 * Student class definition.
 *
 * @author Michael Marsillo
 * @version 2022-01-17
 */
public class Student implements Comparable<Student> {

    // Attributes
    private LocalDate birthDate = null;
    private String forename = "";
    private int id = 0;
    private String surname = "";

    /**
     * Instantiates a Student object.
     *
     * @param id        169057
     * @param surname   Marsillo
     * @param forename  Michael
     * @param birthDate 2005/06/11
     */
    public Student(int id, String surname, String forename, LocalDate birthDate) {

	// assign attributes here
	this.id = id;
	this.surname = surname;
	this.forename = forename;
	this.birthDate = birthDate;

	return;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString() Creates a formatted string of student data.
     */
    @Override
    public String toString() {
	String string = "";

	// your code here
	string = String.format("Name:      %s, %s%nID:        %d%nBirthdate: %s", surname, forename, id,
		birthDate.toString());

	return string;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(final Student target) {
	int result = 0;

	// your code here
	result = this.surname.compareTo(target.surname);
	if (result == 0) {
	    result = this.forename.compareTo(target.forename);
	    if (result == 0) {
		result = Integer.compare(this.id, target.id);
	    }
	}

	return result;
    }

    // getters and setters defined here

    /**
     * @param id
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return
     */
    public int getId() {
	return this.id;
    }

    /**
     * @param surname
     */
    public void setSurname(String surname) {
	this.surname = surname;
    }

    /**
     * @return
     */
    public String getSurname() {
	return this.surname;
    }

    /**
     * @param forename
     */
    public void setForename(String forename) {
	this.forename = forename;
    }

    /**
     * @return
     */
    public String getForename() {
	return this.forename;
    }

    /**
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    /**
     * @return
     */
    public LocalDate getBirthDate() {
	return this.birthDate;
    }

}
