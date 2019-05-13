package org.caps.dev.feeback.service;

import java.util.List;

import org.caps.dev.feeback.beans.Course;
import org.caps.dev.feeback.dao.DaoInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseService
{

	@Autowired
	private DaoInf dao;
	
	@Autowired
	private  Course course;
	
	
	public boolean addCourse(int courseID,String courseName,int noOfDays)
	{
		boolean addCourseStatus=false;
		
		   course.setCourseId(courseID);
		   course.setCourseName(courseName);
		   course.setNoOfDays(noOfDays);
		
         addCourseStatus=dao.addCourse(course);
		
		return addCourseStatus;
	}
	
	
   public List<Course> getCourseDetails()
   {
	   List<Course> courseList=dao.viewCourses();
	   
	   return courseList;
   }
	
	public boolean updateCourseDetails(int courseId, String courseName, int noOfDays)
	{
		boolean upStatus=false;
		
		course.setCourseId(courseId);
		course.setCourseName(courseName);
		course.setNoOfDays(noOfDays);
		
		upStatus=dao.updateCourse(course);
		
		
		return upStatus;
	}
	
}
