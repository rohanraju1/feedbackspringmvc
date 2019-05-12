package org.caps.dev.feeback.dao;

import org.caps.dev.feeback.beans.Employee;
import org.caps.dev.feeback.beans.Faculty;

public interface DaoInf {

	
	public Employee getLoginData(int empId,String password);
	
	public boolean getEmployeeDetails(int facultyId,String eName);
	
	public boolean addFaculty(Faculty faculty);
}
