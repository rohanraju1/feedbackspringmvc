<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Course Maintainance</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/fac"/>"/>
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
                <a href="./HomeTrAdmin.html">Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <div class="dropdown">
                     <button class="dropbtn">Course Maintainance 
                       <i class="fa fa-caret-down"></i>
                     </button>
                     <div class="dropdown-content">
                       <a href="./AddCourse.html">AddCourse</a>
                       <a href="./ViewCourse.html">ViewCourse</a>
                       <a href="./UpdateCourse.html">UpdateCourse</a>
                     </div>
                   </div> 
           </div>
          

          <div id="mainContent"> 
            
            <div id="subContent">
               <form action="addCourse" method="post" >
            
                   <table align="center" cellspacing="10">
                <th> Course Maintainance  </th>
                     <tr>
                       <td align="center">
                         <strong><u>Add Course</u></strong>     
                         </td>
                     </tr>
                   
                   <tr>
                     <td>
                     Course Id: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="cid"/>
                     </td>
                   </tr>
                   <tr>
                     <td>
                       Course Name:&nbsp;<input type="text" name="cname"/>
                     </td>
                   </tr>
                   <tr>
                     <td>
                       No.of.Days:&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="cdays"/>
                       <br><br>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="Add Course"/>
                     </td> 
                     </tr>
                   </table>
              </form>
               
          </div>
  
</body>
</html>