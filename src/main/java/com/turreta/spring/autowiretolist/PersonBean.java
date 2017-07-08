package com.turreta.spring.autowiretolist;

/**
 * Created by Turreta.com on 8/7/2017.
 */
public class PersonBean
{
	private String personId;
	private String lastName;
	private String firstName;

	public PersonBean(String personId, String lastName, String firstName) {
		this.personId = personId;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getPersonId()
	{
		return personId;
	}

	public void setPersonId(String personId)
	{
		this.personId = personId;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@Override public String toString()
	{
		return "PersonBean{" +
				"personId='" + personId + '\'' +
				", lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				'}';
	}
}
