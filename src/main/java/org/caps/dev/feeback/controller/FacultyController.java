package org.caps.dev.feeback.controller;


import java.util.List;

import org.caps.dev.feeback.beans.Employee;
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

	        	System.out.println("added faculty");
	        }
	        else 
	        {
	        	System.out.println("not added faculty");
	        }
		}
		else 
		{
			System.out.println("null values");
		}
    	
   return new ModelAndView("redirect:FacultySkillMain");
	}

	
	//returns web view of view faculty jsp
     @RequestMapping(value="/ViewFaculty",method=RequestMethod.GET)
    public ModelAndView viewFacultyView() 
    {
    	return new ModelAndView("viewFaculty");
    }

      //returns web view of add Faculty jsp
     @RequestMapping(value="/AddFaculty",method=RequestMethod.GET)
     public ModelAndView addFacutyView()
     {
    	 return new ModelAndView("FacultySkillMain");
     }
     
     //returns web view of update Faculty jsp
     @RequestMapping(value="/UpdateFaculty",method=RequestMethod.GET)
     public ModelAndView updateFacutyView()
     {
    	 return new ModelAndView("updateFaculty");
     }
     
     
     //returns view of all faculty details
      @RequestMapping(value="/viewfaculty")
     public ModelAndView viewFacultyDetails() 
     {
    	  ModelAndView model=new ModelAndView();
    	  model.setViewName("ViewFacultyDetails");
    	 List<Employee> elist=fs.getFacultyList();
    	  model.addObject("vList",elist);
    	return model;  
    	  
     }
      
      
        @RequestMapping(value="/updateFaculty")
      public ModelAndView updateFacultyDetails(@RequestParam("Upid") int facultyId,@RequestParam("Upskills") String[] skillSet)
      {   
            boolean updateStatus=fs.updateFaculty(skillSet,facultyId);
            if(updateStatus)
            {
            	System.out.println("Updated");
            	return new ModelAndView("redirect:UpdateFaculty");
            }
            System.out.println("not Updated");
    	  return new ModelAndView("redirect:UpdateFaculty");
      }

       @RequestMapping("/HomeTRAdmin")
      public ModelAndView getHomeAdmin()
      {
    	  return new ModelAndView("HomeTrAdmin");
      }


}
