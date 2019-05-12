package org.caps.dev.feeback.controller;


import org.caps.dev.feeback.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class FacultyController {

	@Autowired
	private FacultyService fs;

	

	@RequestMapping(value="/addFaculty",method=RequestMethod.POST)
	public ModelAndView addFaculty(@RequestParam("fid") int facultyId,@RequestParam("fname") String facultyName,@RequestParam("skills") String[] skills)
	{
            System.out.println("check 1");           
		if(facultyId!=0&&facultyName!=null&&skills!=null)
		{

            System.out.println("check 2");
			
	        boolean stat=fs.facultyValidate(facultyId, facultyName,skills);		
			
	        if(stat)
	        {

	        	System.out.println(" not added faculty");
	        }
	        else 
	        {
	        	System.out.println("added faculty");
	        }
		}
		else 
		{
			System.out.println("null values");
		}
    	
   return new ModelAndView("redirect:/FacultySkillMain");
	}

     @RequestMapping(value="/ViewFaculty",method=RequestMethod.GET)
    public ModelAndView viewFaculty() 
    {
    	return new ModelAndView("viewFaculty");
    }




}
