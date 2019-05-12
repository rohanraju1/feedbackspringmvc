<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Faculty</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/fac.css" />">
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
                       <a href="HomeTrAdmin.html">Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <div class="dropdown">
                            <button class="dropbtn">FacultySkillMaintenance 
                              <i class="fa fa-caret-down"></i>
                            </button>
                            <div class="dropdown-content">
                              <a href="./AddFaculty">AddFaculty</a>
                              <a href="./ViewFaculty">ViewFaculty</a>
                              <a href="#">UpdateFaculty</a>
                            </div>
                          </div> 
                  </div>

           <div id="mainContent"> 
            
             <div id="subContent">
              <form action="viewFaculty" class="form2">
                <table align="center" cellspacing="10">
                       <th><u>View Faculty Details</u></th>
                       
                       <tr>
                            <td><input type="submit" value="Get Details"></td>   
                       </tr>
                   </table>
               </form> 
             </div> 
                
           </div>



</body>
</html>
