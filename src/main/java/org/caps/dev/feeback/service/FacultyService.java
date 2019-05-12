package org.caps.dev.feeback.service;

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

        System.out.println("check 3");	
		boolean res = dao.getEmployeeDetails(facId, facName);
		
		String skill=String.join(",", skills);
		System.out.println(skill);
		
		if(res)
		{

            System.out.println("check 4");
			faculty.setFacultyId(facId);
			faculty.setSkillSet(skill);
			facStatus=dao.addFaculty(faculty);
			
		}
		
		return facStatus;
	}
	
	
	
}
