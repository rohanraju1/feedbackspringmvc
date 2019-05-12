<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Faculty Skill Maintainance</title>
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
                 <form action="./addFaculty" class="form1" method="post">
                     <table align="center" cellspacing="10">
                         <tr>
                             <td align="center">
                             <strong><u>Add Faculty Details</u></strong>     
                             </td>
                         </tr>
                         <tr>
                             <td>Faculty Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="fid"></td>
                         </tr>
                         <tr>
                        <td>Faculty Name:&nbsp;&nbsp;<input type="text" name="fname"></td>
                         </tr>
                         <tr>
                             <td>Skills:
                                 <ul type="none">
                                     <li><input type="checkbox" name="skills"value="Java"/>Java</li>
                                     <li><input type="checkbox" name="skills"value="JEE"/>JEE</li>
                                     <li><input type="checkbox" name="skills"value="SQL"/>SQL</li>
                                     <li><input type="checkbox" name="skills"value="WebDev"/>WebDev</li>
                                     <li><input type="checkbox" name="skills"value="Frameworks"/>Frameworks</li>
                                 </ul>
                                 <br>
                                </td>
                                <td><input type="submit" value="Add Details"> <input type="reset" value="Reset"></td>
                         </tr>
                     </table>
                 </form>
               </div> 
           </div>



</body>
</html>