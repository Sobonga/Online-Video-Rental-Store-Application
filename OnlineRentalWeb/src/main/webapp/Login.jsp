<%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/08
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<%
    String profile_msg=(String)request.getAttribute("profile_msg");
    if(profile_msg!=null){
        out.print(profile_msg);
    }
    String login_msg=(String)request.getAttribute("login_msg");
    if(login_msg!=null){
        out.print(login_msg);
    }
%>
<br/>
<form action="loginprocess.jsp" method="post">
    Email:<input type="text" name="email"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>
</body>
</html>
