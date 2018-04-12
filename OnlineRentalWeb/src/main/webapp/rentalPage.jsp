<%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/10
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%if (request.getParameter("movietitle")!=null){--%>
    <%--VideoController.Videos(request, response);--%>
<%--}%>--%>
<html>
<head>
    <title>Rental Page</title>
</head>
<body>
<form method="post">
    <TABLE style="background-color: #ECE5B6;" WIDTH="50%">
        <tr width="100%">
            <td >Search Movie Title</td>
            <td ><input type="text" name="name"></td>
        </tr>
        <tr>
            <td width="20%">TROY</td>
            <td width="25%"><input type="radio" name="troy"
                                   value="available">Available</td>
            <td width="30%"><input type="radio" name="troy" value="rented"
                                   checked>Rented</td>
            <td width="25%"><input type="radio" name="troy" value="archived">
                Archived</td>
        </tr>
        <tr>
            <td>Titanic</td>
            <td><input type="radio" name="titanic" value="available" checked>
                Available</td>
            <td><input type="radio" name="titanic" value="rented"> Rented</td>
            <td><input type="radio" name="titanic" value="archived"> Archived</td>
        </tr>
        <tr>
            <td>Avengers</td>
            <td><input type="radio" name="avengers" value="available" checked>
                Available</td>
            <td><input type="radio" name="avengers" value="rented">
                Rented</td>
            <td><input type="radio" name="avengers" value="archived"> Archived</td>
        </tr>
        <tr><td></td><td></td>
            <td><input type="submit" name="submit" value="submit"></td></tr>
    </TABLE>
</form>
</body>
</html>