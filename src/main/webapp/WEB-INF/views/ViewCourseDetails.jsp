<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Course</title>
<link href="<c:url value="/resources/css/fb.css" />" rel="stylesheet">
 <style>
       td
       {
           height: 100px;
           width:700px;
       }
    </style>

</head>
<body>
<h1 align="center">View Details</h1>
  <div id="viewForm">
         <br><br>
      <table align="center" border="4" width="400">
        <tr>
         <td>Course_Id</td>
         <td>Course_Name</td>
          <td>No_of_days</td>         
        </tr>                       <!-- Iterate the List Object  data here  -->
        
        <c:forEach items="${clist}" var="list"> 
   <tr>
     <td width="500">${clist[0]}</td>
     <td width="500">${clist[1]}</td>
     <td width="500">${clist[2]}</td>
   </tr>      
   </c:forEach>
    </table>
     </div>
      


</body>
</html>