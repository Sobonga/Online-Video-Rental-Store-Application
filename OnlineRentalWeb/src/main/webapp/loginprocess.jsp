<%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/08
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="bean.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
    boolean status=LoginDao.validate(obj);
    if(status){
        out.println("You are successfully logged in");
        session.setAttribute("session","TRUE");
    }
    else
    {
        out.print("Sorry, email or password error");

    }
%>
