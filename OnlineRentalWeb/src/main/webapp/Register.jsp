<%@ page import="movierental.controller.RegisterController" %><%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/08
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<%if (request.getParameter("name")!=null){
    RegisterController.Register(request, response);
}%>
<form method="post">
    <center>
        <table border="1" width="30%" cellpadding="5">
            <thead>
            <tr>
                <th colspan="2">Enter Information Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="name" value="" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lname" value="" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="" /></td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td><input type="text" name="number" value="" /></td>
            </tr>
            <tr>
                <td>Address</td>
            <tr>
                <td>Line 1</td><td><input type="text" name="line1" value="" /></td>
            </tr>
            <tr>
                <td>Line 2</td><td><input type="text" name="line2" value="" /></td>
            </tr>
            <tr>
                <td>Line 3</td><td><input type="text" name="line3" value="" /></td>
            </tr>
            <tr>
                <td>Code</td><td><input type="text" name="zipcode" value="" /></td>
            </tr>
            </tr>
            <tr>
                <td>UserName</td>
                <td><input type="text" name="uname" value="" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" value="" /></td>
            </tr>
            </tr>
            <tr>
                <td><input type="submit" value="Submit" /></td>
                <td><input type="reset" value="Reset" /></td>
            </tr>
            <tr>
                <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
            </tr>
            </tbody>
        </table>
    </center>
</form>
</body>
</html>
