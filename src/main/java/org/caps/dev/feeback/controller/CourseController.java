package org.caps.dev.feeback.controller;

import java.util.List;

import org.caps.dev.feeback.beans.Course;
import org.caps.dev.feeback.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class CourseController
{

	@Autowired
	private CourseService courseServ;
	
	@RequestMapping(value="/addCourseView",method=RequestMethod.GET)
	public ModelAndView viewAddCourse()
	{
		return new ModelAndView("AddCourse");
	}
	
	
	@RequestMapping(value="/viewCourseView",method=RequestMethod.GET)
	public ModelAndView viewCourse()
	{
		return new ModelAndView("viewCourse");
	}
	
	
	@RequestMapping(value="/updateCourseView",method=RequestMethod.GET)
	public ModelAndView updateCourse()
	{
		return new ModelAndView("updateCourse");
	}
	
	
	
	
	@RequestMapping(value="/addCourse",method=RequestMethod.POST)
	public ModelAndView addCourseDetails(@RequestParam("cid") int courseId,@RequestParam("cname") String courseName,@RequestParam("cdays") int noOfDays)
	{
		boolean addStat=courseServ.addCourse(courseId, courseName, noOfDays);
		
		if(addStat)
		{
			System.out.println("Added Course");
			return new ModelAndView("redirect:AddCourse");
		}
		else 
		{
			System.out.println("Not Added Course");
		}
		
		return new ModelAndView("redirect:AddCourse");
	}
	
	
	@RequestMapping(value="/viewCourse",method=RequestMethod.GET)
	public ModelAndView getCourseDetails()
	{
		 ModelAndView model=new ModelAndView();
   	  model.setViewName("ViewCourseDetails");
   	 List<Course> clist=courseServ.getCourseDetails();
   	  model.addObject("cList",clist);
   	return model;  
	}
	
	
	 @RequestMapping(value="/updateCourse")
     public ModelAndView updateCourseDetails(@RequestParam("Ucid") int courseId,@RequestParam("Ucname") String courseName,@RequestParam("Ucdays") int noOfDays)
     {   
           boolean updateStatus=courseServ.updateCourseDetails(courseId,courseName,noOfDays);
           if(updateStatus)
           {
           	System.out.println("Updated");
           	return new ModelAndView("redirect:updateCourse");
           }
           System.out.println("not Updated");
   	  return new ModelAndView("redirect:updateCourse");
     }
	
	
	
	
	
	
}
