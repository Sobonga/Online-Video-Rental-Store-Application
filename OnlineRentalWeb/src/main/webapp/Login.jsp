<%@ page import="movierental.controller.LoginController" %><%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/08
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<center>
    <form method="post">
        <%
        if (request.getParameter("logbt") !=null){
            LoginController.Login(request,response);
        }
        %>
        <table style="with: 50%">

            <tr>
                <td>UserName</td>
                <td><input type="text" name="uname" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" /></td>
            </tr>
        </table>
        <input type="submit" value="Login"  name="logbt"/></form>
</center>
</body>
</html>
