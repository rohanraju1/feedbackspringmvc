package org.caps.dev.feeback.dao;

import java.util.List;

import org.caps.dev.feeback.beans.Course;
import org.caps.dev.feeback.beans.Employee;
import org.caps.dev.feeback.beans.Faculty;

public interface DaoInf {

	
	public Employee getLoginData(int empId,String password);
	
	public boolean getEmployeeDetails(int facultyId,String eName);
	
	public boolean addFaculty(Faculty faculty);
	
	public List<Employee> viewFacultyAll();
	
	public boolean updateFacultyDetails(Faculty faculty);
	
	public boolean addCourse(Course addCourse);

	public List<Course> viewCourses();

	public boolean updateCourse(Course updateCourse);
	
}
