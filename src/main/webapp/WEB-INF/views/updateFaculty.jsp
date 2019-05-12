<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Update Faculty </title>
    <link href="<c:url value="/resources/css/fac.css" />" rel="stylesheet">
</head>
<body>
        <header>
                <div id="head">
                    <h1 class="header1">
                            Faculty Skill Maintainance
               </h1> 
                </div>

           </header>

            
                  <div class="navbar">
                   
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <a href="./HomeTRAdmin">Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <div class="dropdown">
                            <button class="dropbtn">FacultySkillMaintenance 
                              <i class="fa fa-caret-down"></i>
                            </button>
                            <div class="dropdown-content">
                              <a href="./AddFaculty">AddFaculty</a>
                              <a href="./ViewFaculty">ViewFaculty</a>
                              <a href="./UpdateFaculty">UpdateFaculty</a>
                            </div>
                          </div> 
                  </div>

           <div id="mainContent"> 
            
             <div id="subContent">
                <form action="./updateFaculty" method="post">
                 
                    <table align="center" cellspacing="10">
                    <th><u>Update Faculty Skills </u></th>
                    <tr>
                     <td>Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="number" name="Upid"></td>
                     <td>Name &nbsp;&nbsp;<input type="text" name="Upname"></td>
                    </tr>
                    <tr>
                                            <td>Update Skills
                          <ol type="none">
                                    <li><input type="checkbox" name="Upskills" value="Java">Java</li>
                                    <li><input type="checkbox" name="Upskills" value="Jee">JEE</li>
                                    <li><input type="checkbox" name="Upskills" value="Sql">SQL</li>
                                    <li><input type="checkbox" name="Upskills" value="WebDev">WebDev</li>
                                    <li><input type="checkbox" name="Upskills" value="FrameWorks">Frameworks</li>
                                </ol>
                                <br>
                     </td>
                    </tr>
                    <tr>
                       <td><input type="submit" value="Update"></td>
                    </tr>
                    </table>
                
                
                
                </form>
                </div>
           </div>



</body>
</html>

