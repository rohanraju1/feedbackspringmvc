package org.caps.dev.feeback.controller;

import org.caps.dev.feeback.service.FacultyService;
import org.caps.dev.feeback.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class IndexController {

	@Autowired
	LoginService ls;
	
          //Redirecting from home admin page to add faculty page	
	@RequestMapping(value="/addFacultyView",method=RequestMethod.GET)
	public ModelAndView getAddFacultyView()
	{
		return new ModelAndView("FacultySkillMain");
	}
	
	        //login with username and password & Redirect to Respective page
	@RequestMapping(value="/LoginServ",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("un") int employeeId,@RequestParam("pwd") String Password)
	{

		if(employeeId!=0&&Password!=null)
		{
			String role=ls.loginValidate(employeeId, Password);

			if(role.equals("TrAdmin"))
			{
				return new ModelAndView("HomeTrAdmin");
			}
			if(role.equals("TrCoord"))
			{

			}
			if(role.equals("TrParticipant"))
			{

			}
			else 
			{
				System.out.println("Not in this Program");
			}

		}
		else 
		{
		   System.out.println("Values are invalid or null");
		}
		return new ModelAndView("Login");
	}


	
	
	
	/*@Autowired
	private FacultyService fs;
	@RequestMapping(value="/addFaculty",method=RequestMethod.POST)
	public ModelAndView addFaculty(@RequestParam("") int facultyId,@RequestParam("") String facultyName,@RequestParam("") String[] skills)
	{
            System.out.println("check 1");           
		if(facultyId!=0&&facultyName!=null&&skills!=null)
		{

            System.out.println("check 2");
			
	        boolean stat=fs.facultyValidate(facultyId, facultyName,skills);		
			
	        if(stat)
	        {
	        	System.out.println("added faculty");
	        }
	        else 
	        {
	        	System.out.println(" not added faculty");
	        }
		}
		else 
		{
			System.out.println("null values");
		}
    	
   return new ModelAndView("redirect:/0FacultySkillMain");
	}
*/
}
