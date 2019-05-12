package org.caps.dev.feeback.service;

import java.util.List;

import org.caps.dev.feeback.beans.Employee;
import org.caps.dev.feeback.beans.Faculty;
import org.caps.dev.feeback.dao.DaoInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacultyService {

	@Autowired
	private Faculty faculty;
	
	@Autowired
	DaoInf dao;
	
	public boolean facultyValidate(int facId,String facName,String[] skills)
	{
		boolean facStatus=false;

		boolean res = dao.getEmployeeDetails(facId, facName);
		
		String skill=String.join(",", skills);
		System.out.println(skill);
		
		if(res)
		{

			faculty.setFacultyId(facId);
			faculty.setSkillSet(skill);
			facStatus=dao.addFaculty(faculty);
			
		}
		
		return facStatus;
	}
	
	public List<Employee> getFacultyList() 
	{
		List<Employee> lst=dao.viewFacultyAll();
		return lst;
	}
	
	
	public boolean updateFaculty(String[] skillSet,int facultyId)
	{
		boolean upStatus=false;
		
		String skills=String.join(",", skillSet);
		
		faculty.setFacultyId(facultyId);
		faculty.setSkillSet(skills);
		System.out.println(facultyId);
		System.out.println(skills);
		upStatus=dao.updateFacultyDetails(faculty);
		
		return upStatus;
	}
	
	
}
