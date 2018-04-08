<%--
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
<form method="post" action="registration.jsp">
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
                <td><input type="text" name="fname" value="" /></td>
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
                <td><input type="text" name="pnumber" value="" /></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" value="" /></td>
            </tr>
            <tr>
                <td>UserName</td>
                <td><input type="text" name="uname" value="" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" value="" /></td>
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
