<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Maintainance</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/fac.css"/>"/>
</head>
<body>
        <header>
                <div id="head">
                    <h1 class="header1">
                            Course Maintainance
               </h1> 
                </div>
        </header>

        <div class="navbar">
                   
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="./HomeTRAdmin">Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <div class="dropdown">
                     <button class="dropbtn">Course Maintainance 
                       <i class="fa fa-caret-down"></i>
                     </button>
                     <div class="dropdown-content">
                       <a href="./addCourseView">AddCourse</a>
                       <a href="./viewCourseView">ViewCourse</a>
                       <a href="./updateCourseView">UpdateCourse</a>
                     </div>
                   </div> 
           </div>
          

          <div id="mainContent"> 
            
            <div id="subContent">
              <div id="viewCourse">
      <form action="./viewCourse" method="get">
             
          <table align="center" cellspacing="10">
            <tr>
              <td align="center">
                <strong><u>View Course</u></strong>     
                </td>
            </tr>
          
          <tr>
              <td>
                  <input type="submit" value="View Course">
              </td>
          </tr>
          </table>
     </form>  
     </div>
           </div>    
          </div>
  
</body>
</html>