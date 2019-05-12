<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <div class="bgimg">
   
        <div id="d1">
               
            <form action="./controller/LoginServ" method="post">
                <table align="center" cellspacing="10" class="t1">
                    <th>Login</th>
                    <tr><td>Username:</td></tr>
                    <tr>
                       <td><input type="number"  placeholder="Enter Username" name="un"></td>
                       </tr>
                       <tr><td>Password:</td></tr>
                           <tr>
                     <td><input type="password"  placeholder="Enter Password" name="pwd"></td> 
                    </tr>
                    <tr>
                        <td align="center"><input type="submit" value="Login"> <input type="reset" value="Reset"></td>
                    </tr>
                </table>
            </form>
        </div>    
      </div>
</body>
</html>