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
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<form method="post">
    <%
        String id = request.getParameter("userId");
        String driverName = "org.apache.derby.jdbc.ClientDriver";
        String connectionUrl = "jdbc:derby://localhost:1527/Online Video Rental Application DB";
        String dbName = "Online Video Rental Application";
        String userId = "root";
        String password = "root";

        try {
            Class.forName("apache_derby_net");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        double count = 0;
        double rentalprice = 0;

    %>
    <h2 align="center"><font><strong>Rental Page</strong></font></h2>
    <table align="center" cellpadding="5" cellspacing="5" border="1">
        </tr>
        <tr>
            <td><b>Movie_ID</b></td>
            <td><b>Movie Tittle</b></td>
            <td><b>Description</b></td>
            <td><b>Rental Price</b></td>
        </tr>
        <%
            try{
                connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                statement=connection.createStatement();
                String sql ="SELECT * FROM video";

                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
        %>
        <tr>

            <td><%=resultSet.getString("id") %></td>
            <td><%=resultSet.getString("movietitle") %></td>
            <td><%=resultSet.getString("description") %></td>
            <td><%=resultSet.getString("rentalprice") %></td>
        </tr>

        <%
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            count += rentalprice;
        %>
    </table>
    <table align="center" cellpadding="5" cellspacing="5" border="1">
    <tr>
    <h3>Total Rental</h3>
    <td><input type="text" name="rentalprice" value="" /></td>
    </tr>
        <tr>
            <td><input type="submit" value="Checkout" /></td>
            <td><input type="reset" value="Cancel" /></td>
        </tr>
    </table>
</form>
</body>
</html>