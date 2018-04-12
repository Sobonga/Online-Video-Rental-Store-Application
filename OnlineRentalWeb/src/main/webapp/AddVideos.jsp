<%@ page import="movierental.controller.VideoController" %><%--
  Created by IntelliJ IDEA.
  User: OCTEDVMAX015
  Date: 2018/04/10
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%if (request.getParameter("movietitle")!=null){
        VideoController.Videos(request, response);
}%>
<html>
<head>
    <title>Add Videos</title>
</head>
<body>
<form method="post">
<table border="1">
    <!-- column headers -->
    <tr>
        <c:forEach var="columnName" items="${result.columnNames}">
            <th><c:out value="${columnName}"/></th>
        </c:forEach>
    </tr>
    <tr> <!--Labels the Column Headers-->
        <td>Movie title</td>
        <td>Description</td>
        <td>Rental Price</td>
        </strong>
    </tr>

    <!-- column data -->
    <c:forEach var="row" items="${result.rowsByIndex}">
    <tr>
        <c:forEach var="column" items="${row}">

            <c:if test="${columnName}=='ORD_ID'">
                <td><a href="orderDetails.jsp"><c:out value="${column}"/></a>    </td>
            </c:if>

            <c:if test="${columnName}!='ORD_ID'">
                <td><c:out value="${column}"/>    </td>
            </c:if>



        </c:forEach>
    </tr>
    </c:forEach>


<tr>
    <td><input type="submit" value="Add Movie" value="save" /></td>
    <td><input type="reset" value="Remove Movie" /></td>
</tr>
<tr>
<td><input type="text" name="movietitle"/></td>
<td><input type="text" name="description"/></td>
<td><input type="text" name="rentalPrice"/></td>

</tr>
</form>
</body>
</html>
