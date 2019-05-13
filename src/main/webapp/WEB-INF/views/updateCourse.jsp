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
                <form action="./updateCourse" method="post">
               
                    <table align="center" cellspacing="10">
                      <tr>
                        <td align="center">
                          <strong><u>Update Course</u></strong>     
                          </td>
                      </tr>
                    
                     <tr>
                     <td>
                     Course Id: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="Ucid"/>
                     </td>
                   </tr>
                   <tr>
                     <td>
                       Course Name:&nbsp;<input type="text" name="Ucname"/>
                     </td>
                   </tr>
                   <tr>
                     <td>
                       No.of.Days:&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="Ucdays"/>
                       <br><br>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     </td> 
                     </tr>
                    <tr>
              <td>
                  <input type="submit" value="Update Course">
              </td>
          </tr>
                    </table>
               </form> 
               
          </div>
  
</body>
</html>