package com.turreta.spring.autowiretolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Turreta.com on 8/7/2017.
 */
@Component
public class DepartmentBean
{
	@Autowired
	private List<PersonBean> listOfPersons;

	private String departmentName;

	public List<PersonBean> getListOfPersons()
	{
		return listOfPersons;
	}

	public void setListOfPersons(List<PersonBean> listOfPersons)
	{
		this.listOfPersons = listOfPersons;
	}

	public String getDepartmentName()
	{
		return departmentName;
	}

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
}
