<%@page import="org.caps.dev.feeback.beans.Employee"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Faculty</title>
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
         <td>Faculty_Id</td>
         <td>Faculty_Name</td>
          <td>Role</td>         
        </tr>                       <!-- Iterate the List Object  data here  -->
   
     <c:forEach items="${vList}" var="list">     
   <tr>
     <td width="500">${list[0]}</td>
     <td width="500">${list[1]}</td>
     <td width="500">${list[3]}</td>
   </tr>      
    </c:forEach>

    </table>
     </div>
      



</body>
</html>