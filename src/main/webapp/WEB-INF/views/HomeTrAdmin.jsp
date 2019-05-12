<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Training Admin</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style1.css"/>"/>
</head>
<body >
            <header>
                 <div>
                     <h1>
                    Training Admin
                </h1> 
                 </div>

            </header>

     
           
            <nav class="navigator">
          
                   <div id="navdiv">
                    <ol class="nav_list">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <li><a href="./addFacultyView">Faculty Skill Maintainance</a></li>&nbsp;&nbsp;&nbsp;
                        <li><a href="/Course/addCourse">Course Maintainance</a></li>&nbsp;&nbsp;&nbsp;
                        <li><a href="#">FeedBack Report</a></li>&nbsp;&nbsp;&nbsp;
                 </ol>  
                   

                   </div>
                  <br>
                        <a href="logout">Logout</a>
            </nav>
</body>
</html>