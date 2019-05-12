package org.caps.dev.feeback.service;

import org.caps.dev.feeback.beans.Employee;
import org.caps.dev.feeback.dao.DaoInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

	@Autowired	
	private  DaoInf d;
	

	public  String loginValidate(int empId,String password)
	{
		
	Employee e=d.getLoginData(empId, password);
		String role = null;
	    if(e.getEmployee_ID()==empId&&e.getPassword().equals(password))
	    {
	    	role=e.getRole();
	    }
		
		return role;
	}
	
	
	
	
}
